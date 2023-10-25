package com.cloud.common.proxy.dto.extend;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lde
 * @create 2021/11/27
 */
@Data
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = -1795592589569600357L;


    /**
     * 出发地三字码
     * @mock SHA
     */
    private String deptCode;

    /**
     * 到达地三字码
     * @mock PEK
     */
    private String destCode;

    /**
     * 航班日期
     * @mock 2019-01-01
     */
    private String flightDate;

    /**
     * 航班出发时间（08:00）
     */
    private String deptTime;

    /**
     * 航班到达发时间（08:00）
     */
    private String destTime;

    /**
     * 航班号
     * @mock MU5151
     */
    private String flightNo;

    /**
     * 舱位信息
     * @mock A
     */
    private String cabin;

    /**
     * 订单号
     * @mock 2021010109342094893859
     */
    private String orderId;

    /**
     * 出票时间
     * @mock 日期类型
     */
    private Date ticketTime;

    /**
     * 票号
     * @mock 8650993874
     */
    private String tktNo;

    /**
     * coupon
     * @mock 1
     */
    private String coupon;

    /**
     * 客票状态
     * @mock EXCHANGE
     */
    private String tktStatus;

    /**
     * 退票时间
     */
    private Date refundTime;

    /**
     * 退票费
     * @mock 100
     */
    private String refundFee;

    /**
     * 改期费
     * @mock 129
     */
    private String changeFee;

    /**
     * 改期的原票信息
     */
    OrderInfo oriTktOrderInfo;


    /**
     * 退款时间
     */
    private Date refundMoneyTime;


    /**
     * 改期申请时间
     */
    private Date changeSubmitTime;

    /**
     * 退票申请时间
     */
    private Date refundSubmitTime;



}
