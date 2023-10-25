package com.cloud.common.proxy.dto.change.change;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * OrderInfo :
 *
 * @author xuejupo jpxue@travelsky.com create in 2016-10-24 下午5:28:54
 */

@Data
public class OrderInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1963886378988737478L;

    /**
     * 订单状态,1待支付，2表示改期成功，3表示改期失败,5支付成功，6已取消，7非自愿订单创建成功，8改期中
     */
    private short orderStatus;
    /**
     * 订单状态中文名
     */
    private String orderStatusName;
    /**
     * orderId: 订单号
     */
    private String orderId;

    /**
     * tktNo: 客票号
     */
    private String tktNo;

    private FlightInfo oldFlight;

    private FlightInfo newFlight;

    /**
     * 支付开始时间
     */
    private Date payTime;

    private String airline;

    /**
     * 支付账号
     */
    private String payAccountNumber;

    private Integer payStatus = 1;

    /**
     * amount: 订单金额
     */
    private double amount;

    /**
     * 应支付金额
     */
    private double shouldAmount;

    /**
     * 实际支付金额
     */
    private double realdyAmount;

    /**
     * 优惠金额
     */
    private double favourAmount = 0;
    /**
     * 优惠方式
     */
    private String favourWay;

    /**
     * 流水号
     */
    private String payId;

    /**
     * taxCN: 基建费
     */
    private Double taxCN;

    /**
     * taxYQ: 燃油费
     */
    private Double taxYQ;

    /**
     * fare: 票面价
     */
    private Double fare;

    /**
     * penalty: 差价
     */
    private double differFare;

    /**
     * reissueFee: 换开手续费
     */
    private double reissueFee;

    /**
     * 原改期订单号
     * @param cacheBean
     */
    private String originalReOrderId;

    private String payment;

    private int isNeedDesc = 0;

    private String desc;

    private String userId;
    /**
     * 银行订单号
     * @param cacheBean
     */
    private String tenantOrderId;

    /**
     * 航司改期订单号
     * @param cacheBean
     */
    private String airlineRevadalionOrderid;

    /**
     * productDesc: 产品描述
     */
    private String productDesc;

    /**
     * productName: 产品名
     */
    private String productName;

    /**
     * tenantId: 商户id
     */
    private String tenantId;

    /**
     *账户id
     */
    private String accountId;

    /**
     * 燃油税差额
     */
    private double  fueltaxDifferFare;
    /**
     * 机场建设费差额
     */
    private double airportTaxDifferFare;
    /**
     * 其他差额
     */
    private double otherDifferFare;

    /**
     * 改期原因
     */
    private String reason;

    /**
     * 支付
     */
    private String pluginId;

    /**
     * supportPaymentList: 支持的支付方式
     */
    private List<String> supportPaymentList = new ArrayList<String>();

    public OrderInfo() {
    }

}
