package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class JourneySegment implements Serializable {
    private static final long serialVersionUID = 8237702058554734410L;

    public JourneySegment() {
    }

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
     * 是否延误
     * 空，表示未获取是否延误的数据；
     * true表示延误；
     * false表示未延误；
     */
    private Boolean delayStatus;

    /**
     * 预计起飞时间
     */
    private String estimateDeptTime;

    /**
     * 预计到达时间
     */
    private String estimateDestTime;
}
