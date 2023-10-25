package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by GaoHe on 2018/9/15.
 * @author GaoHe
 */
@Data
public class PassengerBean implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 旅客信息自增
     */
    private String id;

    /**
     * 航旅订单号
     */
    private String orderId;

    /**
     * 航旅纵横用户id
     */
    private String userId;

    /**
     * 旅客姓名
     */
    private String passengerName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;
    /**
     *证件类型
     */
    private String certType;

    /**
     * 证件号
     */
    private String certNo;

    /**
     * 生日
     */
    private String birthday;

    /**
     *类型 A 成人 C 儿童 B 婴儿
     */
    private String type ;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 邮件
     */
    private String mail;

    /**
     * 默认0 ，1标识已取消
     */
    private int status;

    /**
     * 常客id
     */
    private String memberId;

    /**
     * 国籍信息
     */
    private String nationality;

    /**
     * 证件有效期
     */
    private  String certExpiryDate;

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
     * 英文姓
     */
    private String surName;

    /**
     *英文名
     */
    private String givenName;

    /**
     * 监护人证件
     */
    private String guardianCertType;

    /**
     * 监护人证件类型
     */
    private String guardianCertNo;

}
