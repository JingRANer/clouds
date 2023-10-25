package com.cloud.common.proxy.dto.refund;

import lombok.Data;

/**
 * @author lde
 * @create 2021/10/26
 */
@Data
public class NeedRefundSegmentInfo {

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 出发地名称
     */
    private String deptName;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * 到达地三字码
     */
    private String destCode;

    /**
     * 到达地名称
     */
    private String destName;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 往返程标识
     * 0：去程 1：返程
     */
    private int roundTrip;

    /**
     * 航段ID
     */
    private String segmentId;
}
