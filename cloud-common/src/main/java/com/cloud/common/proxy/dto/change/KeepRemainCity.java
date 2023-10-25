package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: ume-mid
 * @description:
 * @author: meizongshuai
 * @create: 2019-05-15 11:09
 **/
@Data
public class KeepRemainCity implements Serializable {
    private static final long serialVersionUID = -2120478644077873971L;
    /**
     * 城市名
     *
     * @mock 哈尔滨
     */
    private String cityName;
    /**
     * 机场三字码
     *
     * @mock HRB
     */
    private String airportCode;
    /**
     * 机场名
     *
     * @mock 北京首都机场
     */
    private String airportName;
    /**
     * 停留时长
     *
     * @mock 2h30min
     */
    private String remainTime;
    /**
     * 停留跨天天数（1代表跨一天）
     *
     * @mock 1
     */
    private String spanDayNum;
    /**
     * 中转服务描述
     */
    private String transferService;

    /**
     * 中转服务详情描述
     */
    private TransferNotice transferNotice;

    /**
     * 中转服务描述颜色
     */
    private String transferServiceColor;
}
