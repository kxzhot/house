package com.fh.common;

public enum ResponseEnum {

    ERROR(-1, "error"),
    USERNAME_USERPWD_IS_EMPTY(1000, "用户名或密码为空"),
    USERNAME_IS_EMPTY(1001, "用户名为空"),
    USERNAME_IS_EXIST(1002, "用户名已存在"),
    USERNAME_IS_ERROR(1003, "用户名错误"),
    USERPWD_IS_ERROR(1004, "密码错误"),
    USER_IS_LOCK(1005, "用户账号已被锁定"),
    USER_UPDATE_PASSWORD_IS_NULL(1006, "用户修改密码时信息为空"),
    PASSWORD_IS_INCONFORMITY(1007, "两次输入的密码不一致"),
    OLDPASSWORD_IS_ERROR(1008, "原密码输入错误"),
    USER_IS_NULL(1009, "用户不存在"),
    MAIL_IS_NULL(1010, "邮箱不存在"),
    PHONE_REPETITION(1011, "手机号已存在"),
    SUCCESS(200, "ok");

    private int code;

    private String msg;

    private ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
