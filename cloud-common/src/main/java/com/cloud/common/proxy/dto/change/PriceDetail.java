package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author jingran
 */
@Data
public class PriceDetail implements Serializable {
    /**
     * 成人往返总价（包含多段）
     *
     * @mock 1200
     */
    private String price;
    /**
     * 婴儿往返总价（包含多段）
     *
     * @mock 1200
     */
//    private String infantTotalPrice;
    /**
     * 儿童往返总价（包含多段）
     *
     * @mock 1200
     */
    private String childTotalPrice;
    /**
     * 成人机场建设费
     *
     * @mock 50
     */
    private String airportTax;
    /**
     * 儿童机场建设费
     *
     * @mock 50
     */
//    private String childAirportTax;
    /**
     * 婴儿机场建设费
     *
     * @mock 50
     */
//    private String infantAirportTax;
    /**
     * 成人燃油税
     *
     * @mock 50
     */
    private String fuelTax;
    /**
     * 儿童燃油税
     *
     * @mock 50
     */
//    private String childFuelTax;
    /**
     * 婴儿燃油税
     *
     * @mock 50
     */
//    private String infantFuelTax;
    /**
     * 不含税币种描述￥/$
     *
     * @mock ￥
     */
    private String priceCurrencyDesc;


    /**
     * 座位差价
     *
     * @mock 843
     */
    private String differPrice;

    /**
     * 座位差价描述
     *
     * @mock 座位差价
     */
    private String differPriceDesc;

    /**
     * 换开手续费
     */
    private String reissueFee;

    /**
     * 改期手续费描述
     * @mock 420
     */
    private String reissueFeeDesc;

    /**
     * 儿童座位差价
     *
     * @mock 843
     */
    private String childDifferPrice;

    /**
     * 儿童换开手续费
     */
    private String childReissueFee;


    /**
     * 余票张数
     *
     * @mock 剩9张
     */
    private String remainTicket;
    /**
     * 去程每一段机票详情(中转时list大于1)
     */
    private List<TicketPriceDetail> departureTicketPriceDetailList;
    /**
     * 返程每一段机票详情(中转时list大于1)
     */
    private List<TicketPriceDetail> returnTicketPriceDetailList;
    /**
     * 支持购票说明
     *
     * @mock
     */
    private String supportBuyTicketDesc;
    /**
     * 是否需要机票校验
     *
     * @mock true
     */
//    private boolean isNeedCheckTicket;
    /**
     * 常客价/活动价往返总价（包含多段）
     *
     * @mock 100
     */
//    private String membershipPrice;
    /**
     * 常客价/活动价往返总价描述（包含多段）
     *
     * @mock 活动兑换价：1元
     */
//    private String membershipPriceDesc;
    /**
     * 权益列表
     */
    private List<PriorityBean> priorityBeanList;
    /**
     * 是否显示权益跳转箭头
     *
     * @mock true
     */
    private boolean isPriorityArrow;
    /**
     * 优惠信息
     */
    private PreferentialInfo preferentialInfo;
    /**
     * 销售商logo
     *
     * @mock http://img.umetrip.com/fs/shopping/static/110,0b0725aefec69e56
     */
    private String shopLogo;
    /**
     * 托运行李信息
     *
     * @mock 无托运行李
     */
    private String baggageAllowance;
    /**
     * 退改签最低价
     */
    private String floorRefundChangePrice;
    /**
     * 余票张数
     *
     * @mock 9
     */
    private Integer remainTicketNumber;
    /**
     * 儿童往返总价描述（包含多段）
     *
     * @mock 1200
     */
//    private String childTotalPriceDesc;

    /**
     * 婴儿往返总价描述（包含多段）
     *
     * @mock 1200
     */
//    private String infantTotalPriceDesc;
}
