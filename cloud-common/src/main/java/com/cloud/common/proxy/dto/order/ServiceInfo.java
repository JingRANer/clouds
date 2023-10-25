package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.passenger.PassengerInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Data
public class ServiceInfo implements Serializable {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 服务id
     */
    private String serviceId;

    /**
     * 服务类型，1为机票
     */
    private Integer serviceType;

    private String servicePassengerType;

    /**
     * 票价
     */
    private Long price;

    /**
     * 手续费
     */
    private Long commission;

    /**
     * 总费用
     */
    private Long charge;

    /**
     * 燃油税
     */
    private Long fuelTax;

    /**
     * 机建费
     */
    private Long airportTax;


    /**
     * 票号，多个用","分隔
     */
    private String tktNo;

    /**
     * 服务状态：
     * OK 已预订占座
     * SERVICEABLE 已出票
     * UNSERVICEABLE 订票失败
     * RFING 退票中
     * RERFING 再次退票中
     * CHGBOOK 改期已下单
     * CHGING 改期中
     * USED 已使用
     * RF 已退票
     * CHG 已改期
     * CHGFAIL 改期失败
     * RF_AUDIT_FAILED 退票审核失败
     * CHANGECANCEL 改期已取消
     * CHANGECREATEFAIL 改期下单失败
     */
    private String serviceStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    private Date updateTime;

    private Date issueTime;

    /**
     * 服务说明
     */
    private String serviceRemark;

    /**
     * 退票费发票id
     */
    private String fapiaoId;

    /**
     * 航旅订单号。与umetrip_air_order表中orderno关联
     */
    private String orderNo;

    /**
     * 航旅id
     */
    private String passengerId;

    /**
     * 航旅子订单号。与umetrip_air_channelorder表中suborderno航旅子订单号。与umetrip_air_channelorder表中suborderno关联
     */
    private String subOrderNo;
    /**
     * 航段信息
     */
    private List<SegmentInfo> segmentInfo;
    /**
     * 乘机人信息
     */
    private PassengerInfo passengerInfo;

    /**
     * 航司订单号
     */
    private String airlineOrderNo;
}
