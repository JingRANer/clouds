package com.cloud.common.proxy.dto.extend;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2021/11/27
 */
@Data
public class TktInfo implements Serializable {

    private static final long serialVersionUID = 3199707746494425914L;
    /**
     * 票号
     */
    private String tktNo;

    /**
     * coupon
     */
    private String coupon;

    private String deptCode;

    private String destCode;

    private String flightNo;

    private String flightDate;

    private String cabin;
}
