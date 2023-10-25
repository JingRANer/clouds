package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.order.OrderSegment;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TicketPassengerInfo implements Serializable {
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
     * 旅客id
     */
    private String passengerId;
    /**
     * 航旅纵横用户id
     */
    private Long userId;

    /**
     * 旅客姓名
     */
    private String passengerName;

    /**
     * 性别
     */
    private String gender;

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
     * 年龄
     */
    private String age;

    /**
     * 客票号
     */
    private String tktNo;

    /**
     * pnr信息
     */
    private String pnr;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 常客id
     */
    private String memberId;

    /**
     * 乘客序列号
     */
    private String passengerSerialNo;

    /**
     * 是否为乘机人本人
     */
    private String isPassengerSelf;

    /**
     * 旅客关联航段集合
     */
    private OrderSegment orderSegment;
}
