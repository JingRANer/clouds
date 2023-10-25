package com.cloud.common.proxy.dto.change.change;

import com.google.common.collect.Lists;
import com.umetrip.air.order.service.dto.passenger.PassengerInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RevalidationCacheBean implements Serializable {

    private static final long serialVersionUID = 2511401434027937428L;

    /**
     * 航旅userId
     */
    private  String userId;
    /**
     * 订单号
     */
    private  String orderId;
    /**
     * 航司订单orderid
     */
    private String airlineorderId;

    /**
     * sessionId: sessionId
     */
    private String sessionId;

    /**
     * orderId:  当前改期操作的订单号
     */
    private OrderInfo order = new OrderInfo();

    /**
     * 主要作为联系人信息
     */
    private UserInfo userInfo = new UserInfo();

    /**
     * oldFlight: 改期前航班
     */
    private FlightInfo oldFlight = new FlightInfo();

    /**
     * newFlight: 要改期到的航班
     */
    private FlightInfo newFlight = new FlightInfo();

    /**
     * reshopRepost: 当前sessionId的reshop查询结果，主要用于后期选完航班和舱位之后根据航班和舱位定位到某一个航班信息
     */
    private ReshopRepost reshopRepost = new ReshopRepost();

    /**
     * 透传数据
     *
     * @return
     */
    private String context;
    /**
     * 航司机票子订单号，吉祥航会用到这个参数
     */
    private String airlineSubOrderNo;

    /**
     * 乘机人信息
     */
    private List<PassengerInfo> passengerBean;

    List<AvaliableFlightBean> list = Lists.newArrayList();

    /**
     * 渠道
     */
    private String source;

    /**
     * 中转订单 1为中转订单
     */
    private String transfer;

    /**
     * 原航段Id
     */
    private Long oriSegmentId;


}
