package com.cloud.common.proxy.dto.refund;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/10/26
 */
@Data
public class NeedRefundPassengerInfo {

    /**
     * 乘机人姓名
     */
    private String passengerName;

    /**
     * passengerId
     */
    private String passengerId;

    /**
     * 乘机人类型
     * A：成人 C：儿童
     */
    private String passengerType;

    /**
     * 乘机人证件号
     */
    private String certNo;

    /**
     * 用户选择的航段信息
     */
    private List<NeedRefundSegmentInfo> segmentInfoList;

}
