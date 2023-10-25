package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ChangeSegment implements Serializable {

    private static final long serialVersionUID = -8095643869580309608L;
    /**
     * 航段id,数据库中存储 的id
     */
    private String segmentId;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 航班到达日期
     */
    private String destFlightDate;

    /**
     * 出发机场三字码
     */
    private String deptCode;

    /**
     * 到达机场三字码
     */
    private String destCode;

    /**
     * 舱位
     */
    private String classCode;

    /**
     * 去程返程标识
     */
    private String roundTrip;

    /**
     * 航段号
     */
    private String coupon;

    /**
     * 出发时间 HH:mm
     */
    private String deptTime;

    /**
     * 到达时间 HH:mm
     */
    private String destTime;
}
