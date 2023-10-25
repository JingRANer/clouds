package com.cloud.common.proxy.dto.order;

import com.umetrip.air.common.enums.TripTypeEnum;
import lombok.Data;

/**
 * @ClassName : SegmentDetail
 * @Description :
 * @Author : jzy
 * @Date: 2021-10-25 21:13
 */
@Data
public class SegmentDetail {
    /**
     * 市场航司
     */
    private String marketAirline;

    /**
     * 承运航司
     */
    private String hostAirline;

    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 承运航班号
     */
    private String hostFlightNo;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 出发机场中文名
     */
    private String deptAirportName;

    /**
     * 到达机场三字码
     */
    private String destCode;

    /**
     * 到达机场中文名
     */
    private String destAirportName;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * '舱位代码'
     */
    private String cabin;
    /**
     * 舱位描述
     */
    private String cabinDesc;
    /**
     * 产品舱位
     */
    private String cabinProduct;
    /**
     * 舱位等级描述
     */
    private String classType;
    /**
     * 往返程标识 0标识去程 1标识返程
     */
    private String roundTrip;
    /**
     * '出发地航站楼'
     */
    private String deptTerminal;
    /**
     * '到达地航站楼'
     */
    private String destTerminal;

    /**
     * '餐食描述'
     */
    private String mealDesc;

    /**
     * 票号
     */
    private String tktNo;

    /**
     * 往返程段数
     */
    private String coupon;

    /**
     * 经停城市名称
     */
    private String stopOverCityName;

    /**
     * 经停地三字码
     */
    private String stopOverCode;

    /**
     * 停留时间
     */
    private String stopOverTime;

    /**
     * 多段经停信息
     */
    private String stopOverContext;

    /**
     * 航段序列号1 2 区分航段先后顺序
     */
    private String serialNumber;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * 免费行李额度
     */
    private String freeBaggage;

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
     * 婴儿燃油税
     */
    private Integer fuelTaxINF;

    /**
     * 燃油税
     */
    private Integer fuelTax;

    /**
     * 儿童机建税
     */
    private Integer airportTaxCHD;

    /**
     * 婴儿机建税
     */
    private Integer airportTaxINF;

    /**
     * 机型
     */
    private String aircraftType;

    /**
     * 大舱位
     */
    private String bigCabin;

    /**
     * 会员价
     */
    private Integer memberPrice;

    /**
     * 透传字段
     */
    private String context;

    private String passengerType;

    /**
     * 其他信息
     * 华夏航为虚拟航班号
     */
    private String virFlightNo;

    /**
     * 渠道
     */
    private String source;

    /**
     * 中转类型
     */
    private TripTypeEnum tripType;

    /**
     * 下单是否包含浮动产品
     */
    private boolean floatingProduct;

    /**
     * 浮动产品的原始价格
     */
    private String originalPrice;

    /**
     * 浮动产品的儿童原始价格
     */
    private String childOriginalPrice;

    /**
     * 浮动产品的婴儿原始价格
     */
    private String infantOriginalPrice;

    /**
     * 儿童舱位是否与成人相同
     */
    private boolean sameClass;

    private String childCabin;

    private String infantCabin;
}
