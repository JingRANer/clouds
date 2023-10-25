package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-08
 */
@Data
public class ChangeJourneySegment implements Serializable {

    private static final long serialVersionUID = 8766474644948654399L;

    /**
     * 航段序号从1开始
     */
    private String index;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 到达航班日期
     */
    private String destFlightDate;

    /**
     * 共享航班号，共享航班时有值
     */
    private String hostFlightNo;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 目的地三字码
     */
    private String destCode;

    /**
     * 起飞机场航站楼
     */
    private String deptTerminal;

    /**
     * 到达机场航站楼
     */
    private String destTerminal;

    /**
     * 起飞时间
     */
    private String deptTime;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * 机型
     */
    private String planeType;

    /**
     * 飞行时长
     */
    private String flyTime;

    /**
     * 里程数
     */
    private String mileage;

    /**
     * 经停信息
     */
    private StopOver stopOver;

    /**
     * 餐食信息
     */
    private String meal;

    /**
     * 0 去程；1 返程
     */
    private Integer roundTrip;

    /**
     * 在去程或返程中的序号，去程第一段，返程第一段
     */
    private String segmentId;

    /**
     * 舱等
     */
    private String cabin;

    /**
     * 舱位等级中文描述
     */
    private String cabinName;

    /**
     * 舱位代码
     */
    private String classCode;

    /**
     * 舱位描述
     */
    private String classDesc;

    /**
     * 免费行李额度
     * @Mock 20
     */
    private String freeBaggage;

}
