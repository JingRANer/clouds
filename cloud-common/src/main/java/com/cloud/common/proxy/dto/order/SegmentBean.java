package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * create on 2018/9/15
 * description:
 * @author urSB
 */
@Data
public class SegmentBean implements Serializable {

    private static final long serialVersionUID = 403637959896832181L;

    /**
     * 是否有餐食
     */
    private Integer meals;

    /**
     * 餐食描述
     */
    private String mealDesc;

    /**
     * 准点率
     */
    private String rate;

    /**
     * 机型
     */
    private String aircraftType;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * 出发地中文名
     */
    private String deptCityName;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 到达机场三字码
     */
    private String destCode;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * 到达地中文名
     */
    private String destCityName;

    /**
     * 舱位等级
     */
    private String cabin;

    /**
     * 舱位描述
     */
    private String cabinDesc;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 儿童价
     */
    private Integer childPrice;

    /**
     * 婴儿价
     */
    private Integer infantPrice;

    /**
     * 机建税
     */
    private Integer airportTax;

    /**
     * 儿童燃油税
     */
    private Integer fuelTaxCHD;

    /**
     * 燃油税
     */
    private Integer fuelTax;

    /**
     * 儿童机建税
     */
    private Integer airportTaxCHD;

    /**
     * 航司
     */
    private String airline;

    /**
     * 舱位等级描述
     */
    private String classType;

    /**
     * 航段号 0,1,2
     */
    private int segment;

    /**
     * 透传字段
     */
    private String context;

    /**
     * 航站楼
     */
    private String destTerminal;

    /**
     * 航站楼
     */
    private String deptTerminal;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 航司中文名
     */
    private String airlineName;

    /**
     * 支付时间
     */
    private String payTime;

    /**
     * 订单状态颜色
     */
    private String statusColor;

    /**
     * 订单状态描述
     */
    private String statusDesc;

    /**
     * 往返程
     */
    private Integer roundTrip;

    /**
     * 出发机场中文名
     */
    private String deptAirportName;

    /**
     * 到达机场中文名
     */
    private String destAirportName;

    /**
     * 订单创建时间
     */
    private String orderTime;

    /**
     * 客票号
     */
    private String tktNo;

    /**
     * 航段号
     */
    private String coupon;

    /**
     * pnr
     */
    private String pnr;

    /**
     * 客票状态
     */
    private String tktStatus;

    /**
     * 会员价
     */
    private Integer memberPrice;

    /**
     * 大舱位
     */
    private String bigCabin;

    /**
     * 大编号
     */
    private String bigPnr;

    /**
     * 经停城市
     */
    private String stopOverCity;

    /**
     * 经停机场code
     */
    private String stopOverAirportCode;

    /**
     * 停留时间
     */
    private String stopOverTime;

    /**
     * 多段经停信息(数据库长度255)
     */
    private String stopOverContext;

    /**
     * 渠道信息
     * 航司渠道航司二字码表示、美程渠道asms表示
     */
    private String source;

    /**
     * 免费托运行李重量
     */
    private String freeBaggage;
    /**
     * 中转值机行李描述
     */
    private String transferCkiBaggage;

    private String orderItemId;


    /**
     * 是否改期航段
     */
    private String isChange;

    private String segmentId;

    private String isNew;

    private String cabinProduct;

    /**
     * 承运航司
     */
    private String hostAirline;
    /**
     * 承运航班号
     */
    private String hostFlightNo;
    /**
     * 旅客姓名
     */
    private String passengerName;
    /**
     * 手机号，加密
     */
    private String mobile;
    /**
     * 证件号
     */
    private String certNo;
    /**
     *证件类型
     */
    private String certType;

}
