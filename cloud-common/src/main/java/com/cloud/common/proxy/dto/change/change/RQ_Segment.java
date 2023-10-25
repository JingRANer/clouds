package com.cloud.common.proxy.dto.change.change;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class RQ_Segment implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 396095810772919374L;

    // 出发地三字码
    private String depAircode;
    // 出发日期
    private String depDate;
    // 出发时间
    private String depTime;
    // 出发站
    private String depTerminal;
    // 目的地三字码
    private String arrAircode;
    // 到达日期
    private String arrDate;
    // 到达时间
    private String arrTime;
    // 达到站
    private String arrTerminal;
    // 航空公司二字码
    private String airline;
    // 航班号
    private String flightNumber;
    // 飞机型号
    private String equipment;
    // 经停站
    private int numberOfStops;
    // 舱位信息，key为舱位，value为舱位储量
    private Map<String, String> cabins;
    //承运方航司二字码
    private String operatingAirline;
    //承运方航班号
    private String operatingFlightNumber;

}
