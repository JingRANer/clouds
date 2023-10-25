package com.cloud.common.proxy.dto.change;

import lombok.Data;

/**
 * @author zcy
 * @Date 2021-11-08
 */
@Data
public class FlightInfoVo {
    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 承运航班号
     */
    private String hostFlightNo;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 出发地
     */
    private String deptCode;

    /**
     * 目的地
     */
    private String destCode;

    /**
     * 舱位
     */
    private String cabin;

}
