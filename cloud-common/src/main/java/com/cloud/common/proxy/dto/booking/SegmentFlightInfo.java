package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class SegmentFlightInfo implements Serializable {

    private static final long serialVersionUID = -2423613776257127311L;

    /**
     * 出发机场及航站楼
     * @mock 北京首都T2
     */
    private String deptCityInfo;

    /**
     * 到达机场及航站楼
     * @mock 上海虹桥T2
     */
    private String destCityInfo;

    /**
     * 经停标志
     * @mock 停
     */
    private String stopAndTransitFlag;

    /**
     * 航司名字及航班号
     * @mock 长龙航空GJ8888
     */
    private String airlineAndFlightNo;

    /**
     * 航班时间
     * @mock 2019-05-05 09:34
     */
    private String flightTime;

    /**
     * 出发地
     */
    private String deptCode;

    /**
     * 到达地
     */
    private String destCode;

    /**
     * 航司二字码
     */
    private String airline;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班起飞日期
     */
    private String flightDate;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 到达时间
     */
    private String destTime;
}

