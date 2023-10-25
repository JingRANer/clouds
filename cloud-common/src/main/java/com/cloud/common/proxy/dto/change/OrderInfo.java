package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

/**
 * OrderInfo :
 *
 * @author xuejupo jpxue@travelsky.com create in 2016-10-24 下午5:28:54
 */

@Data
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = -1963886378988737478L;

    /**
     * orderNo: 订单号
     */
    private String orderNo;

    /**
     * 原行程
     */
    private FlightInfo oldFlight;

    /**
     * 新行程
     */
    private FlightInfo newFlight;

    /**
     * 航司
     */
    private String airline;

    /**
     * amount: 订单金额
     */
    private double amount;

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
     * 以下目前没用到
     */

    /**
     * 改期原因
     */
    private String reason;
    /**
     * 实际支付金额
     */
    private double realdyAmount;

    /**
     * 应支付金额
     */
    private double shouldAmount;
    /**
     * 优惠金额
     */
    private double favourAmount = 0;
    /**
     * 优惠方式
     */
    private String favourWay;


    private int isNeedDesc = 0;
    private String desc;
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

}
