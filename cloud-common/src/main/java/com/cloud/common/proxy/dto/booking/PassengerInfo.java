package com.cloud.common.proxy.dto.booking;

import lombok.Data;

/**
 * @author lde
 * @create 2022/4/1
 */
@Data
public class PassengerInfo {

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
     * 年龄
     */
    private String age;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 英文姓
     */
    private String surName;

    /**
     *英文名
     */
    private String givenName;

    /**
     * 证件有效期
     */
    private String certValidity;

    /**
     * 国籍名称
     */
    private String nationality;

    /**
     * 国籍代码
     */
    private String nationalityCode;

    /**
     * 中文姓
     */
    private String cnSurName;

    /**
     * 中文名
     */
    private String cnGivenName;

    /**
     * 护照签发国名称
     */
    private String authorizeNationality;

    /**
     * 护照签发国二字码
     */
    private String authorizeNationalityCode;

    /**
     * 增加版本标志
     */
    private boolean newVersion;

    /**
     * 版本
     */
    private String version;
}
