package com.cloud.common.proxy.dto.change;

import lombok.Data;

/**
 * @author zcy
 * @Date 2021-11-08
 */
@Data
public class AvailableFlightBean {

    /**
     * flight:  可改签到的航班
     */
    FlightInfo flight = new FlightInfo();

    /**
     * 航司中文名
     */
    private String airlineName;

    /**
     * 航司图标url
     */
    private String airlineUrl;

}
