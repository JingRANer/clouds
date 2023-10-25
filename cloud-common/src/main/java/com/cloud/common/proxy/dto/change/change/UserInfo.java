package com.cloud.common.proxy.dto.change.change;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6123343640666043332L;

    /**
     * userId:
     */
    private String userId;

    /**
     * tel:  手机号
     */
    private String tel;

    /**
     * certid:  身份证号
     */
    private String certid;

    /**
     * version:  当前用户使用的客户端版本
     */
    private String version;

    /**
     * givenName:  姓
     */
    private String givenName;

    /**
     * givenName:  姓
     */
    private String name;

    /**
     * surName: 名
     */
    private String surName;

    private String ip;

    /**
     * 渠道
     */
    private String channel;
    /**
     * 乘客类型
     */
    private String paxType;

    private String paxId;

}
