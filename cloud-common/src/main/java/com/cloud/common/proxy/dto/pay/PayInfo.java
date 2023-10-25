package com.cloud.common.proxy.dto.pay;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xssun
 */
@Data
public class PayInfo implements Serializable{


    private static final long serialVersionUID = 1L;

    /**
     * 支付订单的唯一id
     */
    private Long id;

    /**
     * 订单id 随机字符串
     */
    private String orderId ;

    /**
     * 航旅用户id
     */
    private long userId;

    /**
     * 旅客唯一id
     */
    private Long passengerId;

    /**
     * 票号
     */
    private String ticketNo;

    /**
     * 航司二字码
     */
    private String airline;

    /**
     * 支付账号
     */
    private Integer accountId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 取消订单时间
     */
    private Date cancelTime;

    /**
     * 回调确认时间
     */
    private Date confirmTime;

    /**
     * 支付金额 todo 是否可以改为BigDecimal
     */
    private Integer payment;

    /**
     * 退票费
     */
    private Integer refundFee;

    /**
     *燃油税
     */
    private Integer fueltax;

    /**
     * 机场建设税
     */
    private Integer airportTax;

    /**
     * 机票价格
     */
    private Integer price;

    /**
     * 请求支付信息串儿
     */
    private String sign;

    /**
     * 0 支付，1退款 todo 是否可以改为string
     */
    private int type;

    /**
     * 退票状态  0 未退票 1 退票成功  2 退票待在处理  3 退票失败
     * 支付状态  0 支付成功 1 支付失败
     * todo 是否可以改为string
     */
    private int status;

    /**
     * 支付渠道
     */
    private String pluginId;

    /**
     * 银行订单号
     */
    private String tenantOrderId;

    /**
     * 航司退款orderId
     */
    private String airlineRefundId;

    /**
     * 航旅退款的orderId
     */
    private String refundId;

    /**
     * 退款金额
     */
    private Integer refundAmount;

    /**
     * 退票时间
     */
    private Date refundTime;

    /**
     * 退票备注项
     */
    private String remark;

    /**
     * 退款时间
     */
    private Date refundMoneyTime;

    /**
     * 退票类型  0自愿 1非自愿
     */
    private int refundType;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 交易流水号
     */
    private String serialNumber;

    /**
     * 航段主键id
     */
    private String segmentId;

    /**
     * 退票审核时间
     */
    private Date refundAuditTime;

    /**
     * 退票失败原因
     */
    private String refundFailReason;

    /**
     * 非自愿病退图片key
     */
    private String illRefundPicKey;
    
    /**
     * 退款号
     */
    private String refundNo;

    /**
     * 退票原因
     */
    private String refundRemark;

    /**
     * 改期审核时间
     */
    private Date examineTime;
}
