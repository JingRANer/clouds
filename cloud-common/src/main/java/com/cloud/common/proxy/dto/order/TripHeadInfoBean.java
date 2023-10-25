package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 **/
@Data
public class TripHeadInfoBean implements Serializable {

    private static final long serialVersionUID = 3517792461903987336L;

    /**
     * 航班日期
     * @mock 2019-05-05
     */
    private String flightDate;
    /**
     * 当天是周几
     * @mock 周一
     */
    private String day;
    /**
     * 出发地三字码
     * @mock PEK
     */
    private String deptCode;
    /**
     * 到达地三字码
     * @mock SHA
     */
    private String destCode;
    /**
     * 出发城市中文名
     * @mock 北京
     */
    private String deptCityName;
    /**
     * 到达城市中文名
     * @mock 上海
     */
    private String destCityName;
    /**
     * 计划飞行总时长
     * @mock 2h20min
     */
    private String flyTime;
    /**
     * 出发机场名称
     * @mock 北京首都机场
     */
    private String deptAirportName;
    /**
     * 到达机场名称
     * @mock 上海虹桥机场
     */
    private String destAirportName;
    /**
     * 飞行总距离
     * @mock 飞行距离800km
     */
    private String flightDistance;
}
