package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.common.Guid;
import com.example.common.utils.PasswordUtils;
import com.example.dao.mapper.UserMapper;
import com.example.dao.column.Column;
import com.example.dao.entity.UserDO;
import com.example.response.CommonResultData;
import com.example.service.UserModelService;
import com.example.web.vo.UserVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sunming on 2019/6/20.
 */
@Service
public class UserModelServiceImpl implements UserModelService {

    @Autowired
    private UserMapper userMapper;


    @Transactional
    @Override
    public CommonResultData addUser(UserVO userVo) {
        UserDO userDo = new UserDO();
        BeanUtils.copyProperties(userVo, userDo);
        String uuid = StringUtils.isBlank(userDo.getUuid()) ? Guid.newGUID() : userDo.getUuid();
        userDo.setUuid(uuid);
        //给密码加密
        String password = userDo.getPassword();
        String salt = PasswordUtils.getSalt();
        String new_password = PasswordUtils.encode(password, salt);
        userDo.setPassword(new_password);
        userDo.setSalt(salt);
        userMapper.insert(userDo);
        return CommonResultData.success();
    }

    @Override
    public UserVO findByUsername(String username) {
        QueryWrapper<UserDO> qw = new QueryWrapper<>();
        qw.eq(true, Column.User.USERNAME, username);
        UserDO userDo = userMapper.selectOne(qw);
        UserVO userVo = new UserVO();
        if (userDo != null) {

            BeanUtils.copyProperties(userDo, userVo);
        }
        return userVo;
    }
}
