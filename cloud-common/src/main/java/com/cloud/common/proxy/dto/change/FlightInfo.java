package com.cloud.common.proxy.dto.change;
import lombok.Data;

import java.io.Serializable;

@Data
public class FlightInfo implements Serializable {

    private static final long serialVersionUID = -3951284260150081571L;

    private String cabin;
    private String cabinName;
    /**
     * 航司中文名
     */
    private String airlineName;
    /**
     * flightNo: 航班号
     */
    private String flightNo = "";

    /**
     * 市场航班号
     */
    private String hostFlightNo="";

    /**
     * airline: 航司二字码
     */
    private String airline = "";

    /**
     * deptCode: 出发地三字码
     */
    private String deptCode = "";

    /**
     * deptChn: 出发地中文名
     */
    private String deptChn = "";

    /**
     * destCode: 目的地三字码
     */
    private String destCode = "";

    /**
     * destChn: 目的地中文名
     */
    private String destChn = "";

    /**
     * flightDate: 航班日期
     */
    private String flightDate = "";

    /**
     * arrFlightDate: 到达航班日期
     */
    private String arrFlightDate = "";

    /**
     * std: 计划起飞时间
     */
    private String std = "";

    /**
     * sta: 计划到达时间
     */
    private String sta = "";

    /**
     * std: 计划起飞时间
     */
    private String stdTime = "";

    /**
     * sta: 计划到达时间
     */
    private String staTime = "";

    /**
     * newStopNumber: 经停数量
     */
    private int newStopNumber;

    /**
     * planeType: 飞机型号
     */
    private String planeType = "";

    /**
     * irrtag: 非正常航班标签
     */
    private String irrtag = "";

    /**
     * 航站楼
     * @return
     */
    private String deptTerminal;

    /**
     * 到达地航站楼
     * @return
     */
    private String destTerminal;

    /**
     * 承运航司中文名
     *
     * @return
     */
    private String hostAirlineName;

    /**
     * 承运航司图标
     *
     * @return
     */
    private String hostAirlineUrl;

    /**
     * 经停时间
     *
     * @return
     */
     private String stopTime;

    /**
     * 经过城市
     *
     * @return
     */
    private String stopCity;

    /**
     * 经停城市三字码
     *
     * @return
     */
    private String stopCityCode;

    private String orderItem;

    private String preSegmentId;

    /**
     * 中转城市三字码
     */
    private String transferCode;

    /**
     * 中转城市名
     */
    private String transferCityName;

    /**
     * A-B-C
     * 时间间隔 在中转的情况下指A-C的时间间隔
     *
     */
    private String intervalTime;

    /**
     * 不会用到的
     */

    /**
     * 中转地航站楼
     */
    private String transferTerminal;

    /**
     * 中转地机场名
     */
    private String transferAirport;

    /**
     * 中转第一程到达日期
     */
    private String transferDestDate;

    /**
     * 中转第一程到达时间
     */
    private String transferDestTime;

    /**
     * 中转第二程出发日期
     */
    private String transferDeptDate;

    /**
     * 中转第二程出发时间
     */
    private String transferDeptTime;

    /**
     * 中转第二程航班号
     */
    private String transferFlightNo;

    /**
     * 出发机场
     */
    private String deptAirportName;

    /**
     * 到达机场
     */
    private String destAirportName;

}
