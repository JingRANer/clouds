package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName ConfirmAddOrderInfo.java
 * @Description TODO
 * @createTime 2022年06月07日 18:57
 */
@Data
public class ConfirmAddOrderInfo implements Serializable {
    private static final long serialVersionUID = -4886967610180286369L;

    /**
     * 证件号
     */
    private String certNo;
    /**
     * 姓名
     */
    private String name;
    /**
     * 票价
     */
    private String price;
    /**
     * 票号
     */
    private String tktNo;
    /**
     * 航段序号
     */
    private String coupon;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 航班日期
     */
    private String flightDate;
    /**
     * 出发地三字码
     */
    private String deptCode;
    /**
     * 到达地三字码
     */
    private String destCode;

}
