package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingOrderData.java
 * @Description TODO
 * @createTime 2022年10月26日 13:09:00
 */
@Data
public class ShardingPaymentData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * '主键'
     */
    private Long id;
    /**
     * '本次支付id'
     */
    private String paymentId;

    /**
     * 支付类型 0：支付，1：退款
     */
    private String type ;

    /**
     * 支付类型 301 支付宝 302微信
     */
    private String pluginId;

    /**
     * 支付流水号/退款流水号
     */
    private String serialNumber;

    /**
     * '支付银行订单号'
     */
    private String tenantOrderId;

    /**
     * '航旅支付商户号'
     */
    private String accountId;

    /**
     * 航司安慰性支付校验字段
     */
    private String airlinePayId;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * '确认支付时间'
     */
    private Date confirmTime;

    /**
     * '支付状态，0 未支付，1已支付，2支付确认中,3 支付失败'
     */
    private String status;

    /**
     * 请求支付信息串儿
     */
    private String sign;

    /**
     * '航旅订单号'
     */
    private String orderNo;

    /**
     * 原支付ID
     */
    private String oriPaymentId;

    /**
     * 错误码
     */
    protected Integer errCode;

    /**
     * 错误原因
     */
    protected String errMsg;

    /**
     * 实际支付金额/实际退还金额
     */
    protected BigDecimal actualAmount;

    /**
     * 礼金扣减金额/退还礼金金额
     */
    protected BigDecimal cashGiftDeductAmount;

    /**
     * 礼金比例
     */
    protected BigDecimal cashGiftRatio;

    /**
     * 操作人用户ID
     */
    private String userId;
    /**
     * 消费方式（默认现金支付）
     */
    protected String payType;
    /**
     * 是否更新操作
     */
    private boolean update;
}
