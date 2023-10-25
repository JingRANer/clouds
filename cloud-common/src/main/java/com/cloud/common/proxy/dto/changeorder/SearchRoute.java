package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class SearchRoute implements Serializable {

    private static final long serialVersionUID = 3321534629687563801L;

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
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 达到地三字码
     */
    private String destCode;

    /**
     * 舱位代码
     */
    private String classCode;

    /**
     * 产品代码，用于处理东航等一舱多价的情况
     */
    private String fareProductCode;

}
