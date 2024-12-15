package com.cloud.order.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Segment
 * @create: 2024-12-15 21:07
 **/

@Data
public class Segment {
    /**
     * 自增id
     */
    private Long id;
    /**
     * 航段ID
     */
    private String segmentId;

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
     * 出发机场三字码
     */
    private String deptCode;

    /**
     * 出发机场名称
     */
    private String deptAirportName;

    /**
     * 出发地城市名
     */
    private String deptCityName;

    /**
     * 目的地机场三字码
     */
    private String destCode;

    /**
     * 目的机场名称
     */
    private String destAirportName;

    /**
     * 目的地城市名
     */
    private String destCityName;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * 舱位等级
     */
    private String cabin;
    /**
     * 舱位折扣
     */
    private String cabinDiscount;
    /**
     * 舱位产品名称
     */
    private String cabinProduct;
    /**
     * 舱位代码
     */
    private String classCode;

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
     * 客票状态OPEN FOR USE,REFUNDED,EXCHANGED,USED/FLOWN
     */
    private String tktStatus;

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 航段序列号1 2 区分航段先后顺序
     */
    private String serialNumber;

    /**
     * 服务id
     */
    private String serviceId;
    /**
     * 免费行李额度
     */
    private String freeBaggage;
    /**
     * 改期或退票订单中记录原订单的segmentid
     */
    private String oriSegmentId;
    /**
     * 改期单中从哪张票改过来的，即票号
     */
    private String oriTktNo;
    /**
     * 改期单中从哪个航段改过来的，即coupon号
     */
    private String oriCoupon;

    /**
     * 是否选择了当前segment true为选择了。false为未选择
     */
    private boolean selected;

    /**
     * context 下单是需要用到的context信息
     */
    private String context;

    /**
     * 票价
     */
    private Long price;
    /**
     * 燃油税
     */
    private Long fuelTax;

    /**
     * 机建费
     */
    private Long airportTax;

    /**
     * 是否已取消 0 未取消 1 已取消
     */
    private int opened;

    /**
     * 虚拟航班号
     */
    private String others;

    /**
     * pnr
     */
    private String pnr;
    /**
     * 操作人用户ID
     */
    private String userId;

    /**
     * 产品的原始价格
     */
    private BigDecimal originalPrice;

    /**
     * 是否浮动运价 1标识此航段为浮动产品
     */
    private int floatingProduct;

    /**
     * 舱位产品代码
     */
    private String cabinProductCode;
}