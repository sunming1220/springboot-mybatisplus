package com.example.service;


import com.example.response.CommonResultData;
import com.example.web.vo.UserVO;

/**
 * Created by sunming on 2019/6/20.
 */
public interface UserModelService {

    /**
     * 新增用户
     * @param userVo
     * @return
     */
    CommonResultData addUser(UserVO userVo);

    /**
     * 通过账号名找到该账号
     */
    UserVO findByUsername(String username);
}
