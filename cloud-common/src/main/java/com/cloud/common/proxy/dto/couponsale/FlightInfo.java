package com.cloud.common.proxy.dto.couponsale;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lde
 * @create 2022/6/27
 */
@Data
public class FlightInfo implements Serializable {
    private static final long serialVersionUID = 7840860181661539442L;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 到达地三字码
     */
    private String destCode;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班日期
     */
    private Date flightDate;
}
