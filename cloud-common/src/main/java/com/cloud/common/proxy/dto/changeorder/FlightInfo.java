package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * 航班信息
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/6 10:55
 */
@Data
public class FlightInfo implements Serializable {
    private static final long serialVersionUID = -4681087906912575349L;
    /**
     * 订单渠道
     */
    private String source;
    /**
     * 航司二字码
     */
    private String airline;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 舱等
     */
    private String cabin;
    /**
     * 舱位
     */
    private String classCode;
    /**
     * 舱位产品
     */
    private String cabinProduct;
    /**
     * 航班日期 yyyy-MM-dd
     */
    private String flightDate;
    /**
     * 航班起飞时间 yyyy-MM-dd HH:mm
     */
    private String flightTime;
    /**
     * 出发地三字码
     */
    private String deptCode;
    /**
     * 目的地三字码
     */
    private String destCode;
}
