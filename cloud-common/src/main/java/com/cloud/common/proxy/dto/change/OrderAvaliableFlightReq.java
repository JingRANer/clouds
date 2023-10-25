package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2021-05-31
 */
@Data
public class OrderAvaliableFlightReq implements Serializable {
    private static final long serialVersionUID = -7222822439540856075L;

    /**
     * 航司二字码
     */
    private String airline;

    /**
     * 订单号
     */
    private String orderNo;

/*
    */
/**
     * 是否中转信息，1为中转（中转拆单了）
     *//*

    private String transfer;
*/


   /* *
     * 航段信息  目前只有放一条，即单段改
     */
    // TODO: 2021-09-15 怎么对中转的会更加适用
//    List<SegmentBriefInfo> segments;

    /**
     * 乘客信息 可以多人改
     */
//    private List<PassengerBriefInfo> passengerInfos;

    /**
     * 改期原因
     */

    private String changeReason;

    /**
     * 改期类型，默认0，自愿
     */

    private int changeType;

    /**
     * 非自愿时传过来的图片
     */
    private String submitFile;


    /**
     * 将要改期到的航班日期
     */
    private String flightDate;

    private String sessionId;

    /**
     * 非自愿时传过来的图片
     */
    private List<String> changeSubmitFile;


}
