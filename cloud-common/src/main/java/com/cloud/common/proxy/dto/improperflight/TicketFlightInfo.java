package com.cloud.common.proxy.dto.improperflight;

import lombok.Data;

/**
 * @author lde
 * @create 2021/9/26
 */
@Data
public class TicketFlightInfo {

    /**
     * 客票号
     */
    private String ticketNo;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * 到达日期
     */
    private String destDate;

    /**
     * 到达时间
     */
    private String destTime;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 出发地code
     */
    private String deptCode;

    /**
     * 到达地code
     */
    private String destCode;

    /**
     * 乘客姓名
     */
    private String passengerName;

    /**
     * 航班动态状态描述
     */
    private String flightStatusDesc;

    /**
     * 计划起飞时间
     */
    private String ptd;

    /**
     * 预计起飞时间
     */
    private String etd;

    /**
     * 客票状态
     */
    private String ticketStatus;

    /**
     * 是否IRR
     * 是：1 否：0
     */
    private String irr;

    /**
     * 是否国际票
     * 1:国际
     * 0:国内
     */
    private String international;

    /**
     * 航司
     */
    private String airline;

    /**
     * 是否满足发布的非自愿退改条件
     * 1:满足
     */
    private String conformPolicy;

    /**
     * 是否是改期后客票
     * 1:是改期后客票
     */
    private String exchangeTicket;

    /**
     * 是否是OPEN票
     * 1:是
     */
    private String openTicket;

    /**
     * 出票渠道
     * airline航旅直销出票，ASMS美程出票，NOTUME非航旅出票
     */
    private String source;
}
