package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FlightDetail implements Serializable {

    /**
     * 航司二字码
     */
    private String airline;

    /**
     * 航司中文名
     */
    private String airlineName;

    /**
     * 航司图标url
     */
    private String airlineUrl;

    /**
     * flightNo: 航班号
     */
    private String flightNo;

    /**
     * 市场航班号
     */
    private String hostFlightNo;

    /**
     * 出发城市名
     */
    private String deptCityName;
    /**
     * 到达城市名
     */
    private String destCityName;

    /**
     * 出发机场名
     */
    private String deptAirportName;

    /**
     * 到达机场名
     */
    private String destAirportName;

    /**
     * 出发机场航站楼
     *
     * @mock T1
     */
    private String deptTerminal;

    /**
     * 到达机场航站楼
     *
     * @mock T2
     */
    private String destTerminal;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 出发日期，到日2021-02-02
     */
    private String deptDate;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 出发时间 00:00:00时分秒
     */
    private String deptTime;

    /**
     * 到达时间
     */
    private String destTime;


    /**
     * 出发日期+出发时间 2021-11-10 19:05:00
     */
    private String stdTime;

    /**
     * 到达日期+到达时间 2021-11-10 21:35:00
     */
    private String staTime;

    /**
     * 出发时间 19:05
     */
    private String std;

    /**
     * 到达时间 21:35
     */
    private String sta;

    /**
     * 跨天 出发到达跨天天数（跨天才显示+1天）
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
     * 飞行距离
     */
    private String tpm;
    /**
     机型
     */
    private String acType;

    /**
     * 餐食
     */
    private String meal;

    /**
     * 机龄
     */
    private String planeAge;

    /**
     * 星期
     */
    private String weekDay;

    /**
     * 飞行时长
     */
    private String flyTime;

    /**
     * 准点率
     */
    private String  onTimeRate;

    /**
     * 出发地摆渡车率
     */
    private String depbusRate;
    /**
     * 到达地摆渡车率
     */
    private String desbusRate;
    /**
     * 出发地靠廊桥率
     */
    private String depbridgeRate;
    /**
     * 到达地靠廊桥率
     */
    private String desbridgeRate;
    /**
     * 平均延误
     */
    private String delyTime;


    public FlightDetail(){

    }
}
