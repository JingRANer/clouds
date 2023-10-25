package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName PassengerInfo.java
 * @Description TODO
 * @createTime 2022年06月07日 17:24
 */
@Data
public class PassengerInfo implements Serializable {
    private static final long serialVersionUID = 1003095941430668622L;

    /**
     * 姓名
     */
    private String passengerName;
    /**
     * 证件类型
     */
    private String certType;
    /**
     * 证件号
     */
    private String certNo;
    /**
     * 乘客类型
     * 成人（ A），儿童（C），婴儿（B）
     */
    private String type;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 性别
     */
    private String gender;
    /**
     * 性别
     * M：男性、F：女性
     */
    private String age;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 用户Id
     * 本人购票时存在
     */
    private String userId;
    /**
     * 英文姓
     */
    private String surName;
    /**
     * 英文名
     */
    private String givenName;
    /**
     * 证件有效期
     */
    private String certValidity;
    /**
     * 国籍中文描述
     */
    private String nationality;
    /**
     * 国籍二字码
     */
    private String nationalityCode;

}
