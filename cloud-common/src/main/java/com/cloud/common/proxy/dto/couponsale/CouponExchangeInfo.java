package com.cloud.common.proxy.dto.couponsale;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lde
 * @create 2022/6/27
 */
@Data
public class CouponExchangeInfo implements Serializable {
    private static final long serialVersionUID = 8367195285201608000L;
    /**
     * 航旅订单号
     */
    private String orderNo;

    /**
     * 航司订单号
     */
    private String airlineOrderNo;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 航班信息
     */
    private FlightInfo flightInfo;


}
