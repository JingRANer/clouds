package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class KeepRemainCity implements Serializable {

    private static final long serialVersionUID = -2771761353157026375L;
    /**
     * 城市名
     * @mock 哈尔滨
     */
    private String cityName;
    /**
     * 机场三字码
     * @mock HRB
     */
    private String airportCode;
    /**
     * 机场名
     * @mock 北京首都机场
     */
    private String airportName;
    /**
     * 停留时长
     * @mock 2h30min
     */
    private String remainTime;

    /**
     * 停留跨天天数（1代表跨一天）
     * @mock 1
     */
    private String spanDayNum;
}
