package com.example.common.config;

/**
 * 安全中心统一错误码
 * 
 * @author liuming
 * @date 2019/04/11
 */
public enum AuthErrorEnum {

    /**
     * 账户为空
     */
    ACCOUNTEMPTY(2001, "账号为空"),

    /**
     * 密码为空
     */
    PASSWORDEMPTY(2002, "密码为空"),

    /**
     * 账户不存在
     */
    ACCOUNTNOTEXIST(3001, "账户不存在"),

    /**
     * 密码错误
     */
    PASSWORDERROR(3002, "密码错误"),

    /**
     * 账户被锁定
     */
    ACCOUNTLOCKED(3003, "账户被锁定"),

    /**
     * 账户异常，请联系客服
     */
    ACCOUNTEANOMALY(3005, "账户异常，请联系客服"),

    /**
     * 超级管理员不允许修改
     */
    ADMIN_CAN_NOT_CHANGE(3006, "超级管理员不允许修改"),

    /**
     * 用户名已存在
     */
    ACCOUNT_NAME_EXIST(3007, "用户名已存在"),

    /**
     * 手机号已存在
     */
    MOBILE_EXIST(3007, "手机号已存在"),

    /**
     * 角色名已存在
     */
    ROLE_NAME_EXIST(3008, "角色名已存在"),

    /**
     * 管理员已存在，不允许添加
     */
    ADMIN_EXIST_CANNOTADD(3009, "管理员已存在，不允许添加"),

    /**
     * 角色已经关联用户，无法删除
     */
    ROLE_HAVE_USER_CANNOT_DELETE(3010, "角色已经关联用户，无法删除"),

    /**
     * 
     */
    TOKEN_EMPTY(4001, "token为空"),;

    private int code;
    private String message;

    private AuthErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
