package com.cloud.common.proxy.dto.booking;

import lombok.Data;

/**
 * @author lde
 * @create 2023/2/16
 */
@Data
public class RepeatOrderInfo {

    /**
     * 出发地城市名称
     */
    private String deptCode;
    /**
     * 到达地城市名称
     */
    private String destCode;
    /**
     * 航班日期
     */
    private String flightDate;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 订单创建时间
     */
    private String createTime;
    /**
     * 订单号
     */
    private String orderNo;


}
