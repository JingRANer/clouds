package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2021-06-01
 */
@Data
public class SegmentBriefInfo implements Serializable {
    private static final long serialVersionUID = 3057163685649825964L;

    /**
     * offerId todo
     */
    private String offerId;

    /**
     * segmentId todo
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
     * 到达日期
     */
    private String destDate;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * '舱位代码'
     */
    private String cabin;
    /**
     * 舱位描述
     *
    private String cabinDesc;

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

}
