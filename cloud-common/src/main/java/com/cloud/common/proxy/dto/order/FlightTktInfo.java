package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class FlightTktInfo implements Serializable {

    private static final long serialVersionUID = -7839768225255649318L;

    /**
     * 航班日期
     * @mock 2019-05-05
     */
    private String flightDate;
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
     * 计划起飞时间
     * @mock 2019-05-05 20:10
     */
    private String deptTime;
    /**
     * 计划到达时间
     * @mock 2019-05-05 13:00
     */
    private String destTime;
    /**
     * 出发到达跨天天数（跨天才显示+1天）
     * @mock 1
     */
    private String spanDayNum;
    /**
     * 经停城市信息
     */
    private List<KeepRemainCity> stopOverCity;
    /**
     * 中转城市信息
     */
    private KeepRemainCity transferCity;
    /**
     * 出发地机场中文名
     * @mock 北京首都机场
     */
    private String deptAirportName;
    /**
     * 到达地机场中文名
     * @mock 上海虹桥机场
     */
    private String destAirportName;
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
     * 出发机场航站楼
     * @mock T1
     */
    private String deptTerminal;
    /**
     * 到达机场航站楼
     * @mock T2
     */
    private String destTerminal;
    /**
     * 航司图片
     */
    private String airlineIcon;
    /**
     * 航司中文名
     * @mock 青岛航空
     */
    private String flightCompany;
    /**
     * 航班号
     * @mock CA1854
     */
    private String flightNo;
    /**
     * 是否共享
     * @mock 共享
     */
    private String hasShare;
    /**
     * 实际承运航司中文名（中国国航）
     * @mock 中国国航
     */
    private String hostAirline;
    /**
     * 实际承运航班,如果是共享航班，需要显示出主航班
     * @mock QW1234
     */
    private String hostNo;
    /**
     * 机型描述
     * @mock 波音73V（大）
     */
    private String planeTypeDesc;
    /**
     * 计划飞行时长
     * @mock 2h20min
     */
    private String flyTime;
    /**
     * 当天是周几
     * @mock 周一
     */
    private String day;

    /**
     * 舱位描述
     */
    private String cabinDisDesc;

    /**
     * 中转展示字段
     */
    private String transferDesc;

    /**
     * 经停展示字段
     */
    private String stopOverDesc;

    /**
     * 中转值机和行李描述
     */
    private String transferCkiBaggage;

    /**
     * 托运行李
     */
    private String freeBaggage;

}
