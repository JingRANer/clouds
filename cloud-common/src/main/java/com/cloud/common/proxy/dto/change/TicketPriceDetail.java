package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

@Data
public class TicketPriceDetail implements Serializable {


    /**
     * 扩展 offerId
     */
    private String offerId;

    /**
     * 扩展 segmentId
     */
    private String segmentId;

    /**
     * 报价源
     *
     * @mock QW
     */
    private String source;
    /**
     * 大舱位
     *
     * @mock Y
     */
    private String bigCabin;
    /**
     * 小舱位
     *
     * @mock M
     */
    private String cabin;
    /**
     * 价格
     *
     * @mock 1200
     */
    private String price;
    /**
     * 儿童价
     *
     * @mock 1000
     */
    private String childPrice;
    /**
     * 婴儿价
     *
     * @mock 800
     */
    private String infantPrice;
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
    private String childAirportTax;
    /**
     * 婴儿机场建设费
     *
     * @mock 50
     */
    private String infantAirportTax;
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
    private String childFuelTax;
    /**
     * 婴儿燃油税
     *
     * @mock 50
     */
    private String infantFuelTax;
    /**
     * 座位数
     *
     * @mock 剩9张
     */
    private String seats;
    /**
     * 是否支持儿童票售卖
     *
     * @mock true
     */
    private boolean supportChild;
    /**
     * 是否支持婴儿票售卖
     *
     * @mock true
     */
    private boolean supportInfant;
    /**
     * 免费行李重量
     *
     * @mock 10kg
     */
    private String freeBaggage;
    /**
     * 透传数据
     */
    private String context;
    /**
     * 退改签具体Url
     *
     * @mock
     */
    private String refundUrl;
    /**
     * 舱位折扣描述
     *
     * @mock X舱 7.8折
     */
    private String cabinDisDesc;
    /**
     * 航司二字码
     *
     * @mock QW
     */
    private String airline;
    /**
     * 航班号
     *
     * @mock CA1515
     */
    private String flightNo;
    /**
     * 航班日期
     *
     * @mock 2019-05-05
     */
    private String flightDate;
    /**
     * 出发地三字码
     *
     * @mock PEK
     */
    private String deptCode;
    /**
     * 到达地三字码
     *
     * @mock SHA
     */
    private String destCode;
    /**
     * 舱位属性
     *
     * @mock 兑换票/特价票
     */
    private String cabinProperty;
    /**
     * 里程
     *
     * @mock 98里程
     */
    private String mileageScore;
    /**
     * 常客价
     *
     * @mock 100
     */
    private String membershipPrice;
    /**
     * 区分清楚大舱位代码
     *
     * @mock W
     */
    private String midCabin;
    /**
     * 航段
     *
     * @mock 0.5航段
     */
    private String legScore;
    /**
     * 舱位描述
     *
     * @mock B舱
     */
    private String cabinDesc;
    /**
     * 折扣
     *
     * @mock 5.0折
     */
    private String discountDesc;
    /**
     * 品牌舱位名
     *
     * @mock 明珠超级经济舱
     */
    private String cabinBrandName;
    /**
     * 舱位品牌 Y:COMMON_Y
     */

    private String cabinProduct;

//    /**
//     * 中转舱位
//     */
//    private String transferCabin = "";

}
