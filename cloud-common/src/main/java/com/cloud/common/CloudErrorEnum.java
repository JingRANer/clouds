package com.cloud.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CloudErrorEnum {

    /**
     * 账号密码登录
     */
    SUCCESS(0L, "success"),
    LOGIN_NO_USER(-100001L, "没有用户可登录"),
    LOGIN_WRONG_PASSWORD(-100002L, "密码错误"),
    ;

    private final Long errCode;
    private final String errMsg;




}
