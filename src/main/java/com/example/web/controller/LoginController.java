package com.example.web.controller;

import com.example.common.security.JwtAuthenticatioToken;
import com.example.common.utils.PasswordUtils;
import com.example.common.utils.SecurityUtils;
import com.example.common.config.AuthErrorEnum;
import com.example.response.CommonResultData;
import com.example.service.UserModelService;
import com.example.web.vo.LoginBean;
import com.example.web.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunming on 2019/6/22.
 */
@RestController
@Api(tags = "登录")
@RequestMapping("api/user")
public class LoginController {
    @Autowired
    private UserModelService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @ApiOperation("登录")
    @PostMapping(value = "/login",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResultData login(@RequestBody LoginBean loginBean, HttpServletRequest request){
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        //简单的参数校验
        if(StringUtils.isBlank(username)){
            return CommonResultData.error(AuthErrorEnum.ACCOUNTEMPTY.getCode(),
                    AuthErrorEnum.ACCOUNTEMPTY.getMessage());
        }
        if(StringUtils.isBlank(password)){
            return CommonResultData.error(AuthErrorEnum.PASSWORDEMPTY.getCode(),
                    AuthErrorEnum.PASSWORDEMPTY.getMessage());
        }
        //获取用户信息
        UserVO user = userService.findByUsername(username);
        if(user == null){
            return CommonResultData.error(AuthErrorEnum.ACCOUNTNOTEXIST.getCode(),
                    AuthErrorEnum.ACCOUNTNOTEXIST.getMessage());
        }
        if (!PasswordUtils.matches(user.getSalt(), password, user.getPassword())) {
            return CommonResultData.error(AuthErrorEnum.PASSWORDERROR.getCode(),
                    AuthErrorEnum.PASSWORDERROR.getMessage());
        }
        JwtAuthenticatioToken token = SecurityUtils.login(request, user.getUsername(), password, authenticationManager);
        return CommonResultData.success(token);

    }

    @ApiOperation("注册,新增用户")
    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResultData register(@RequestBody UserVO userVo){
        CommonResultData commonResultData = userService.addUser(userVo);
        return commonResultData;
    }

}
