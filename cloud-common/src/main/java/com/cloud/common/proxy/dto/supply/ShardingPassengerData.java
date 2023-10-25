package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingPassengerData.java
 * @Description TODO
 * @createTime 2022年10月26日 16:48:00
 */
@Data
public class ShardingPassengerData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long id;

    /**
     * 旅客id
     */
    private String passengerId;

    /**
     * 旅客姓名，加密
     */
    private String name;

    private String userId;

    /**
     * 性别，F女，M男
     */
    private String gender;

    /**
     * 乘客类型A成人C儿童I婴儿
     */
    private String type;

    /**
     * 证件类型，0身份证2护照3其他5户口本7台胞证8回乡证9港澳台身份证
     */
    private Integer certType;

    /**
     * 证件号，加密
     */
    private String certNo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期，yyyy-MM-dd
     */
    private String birthday;

    /**
     * 手机号，加密
     */
    private String mobile;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 航旅大订单号
     */
    private String superOrderNo;

    /**
     * 国籍信息
     */
    private String nationality;

    /**
     * 证件有效期
     */
    private  String certExpiryDate;

    /**
     * 操作人ID
     */
    private String umeUserId;
    /**
     * 是否更新操作
     */
    private boolean update;

    /**
     * 英文姓
     */
    private String surName;

    /**
     *英文名
     */
    private String givenName;

    /**
     * 护照签发国二字码
     */
    private String authorizeNationalityCode;

    /**
     * 中文姓
     */
    private String cnSurName;

    /**
     * 中文名
     */
    private String cnGivenName;


}
