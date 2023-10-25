package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

/**
 * @author lde
 * @create 2022/3/24
 */
@Data
public class SegmentInfo {

    /**
     * 航段id
     */
    private String segmentId;
    /**
     * 市场航司
     */
    private String marketAirline;
    /**
     * 承运航司
     */
    private String hostAirline;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 承运航班号
     */
    private String hostFlightNo;
    /**
     * 出发地三字码
     */
    private String deptCode;
    /**
     * 到达地三字码
     */
    private String destCode;
    /**
     * 出发日期
     */
    private String deptDate;
    /**
     * 出发时间
     */
    private String deptTime;
    /**
     * 舱等
     */
    private String cabin;
    /**
     * 舱位
     */
    private String classCode;
    /**
     * 往返标识 0 去程 1 返程
     */
    private Integer roundTrip;
    /**
     * 航段号
     */
    private String coupon;
    /**
     * 客票状态
     */
    private String tktStatus;
    /**
     * 航段序列号
     */
    private String serialNumber;
    /**
     * 客票是否已OPEN
     * 0未取消 1已取消
     */
    private int opened;

}
