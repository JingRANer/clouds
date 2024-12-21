package com.cloud.order.rpc.neo4j.pojo;

import lombok.Data;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Segment
 * @create: 2024-12-15 22:34
 **/

@Data
public class Segment {


    private String segmentId;

    private String marketAirline;

    private String flightNo;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 工作日 / 休息
     */
    private String weekendType;

    /**
     * 早中晚
     */
    private String deptTimeType;

    private String deptCode;

    private String destCode;

    private String price;

    /**
     * 舱位等级
     */
    private String cabin;

    /**
     * 行李额度
     */
    private String freeBaggage;
}
