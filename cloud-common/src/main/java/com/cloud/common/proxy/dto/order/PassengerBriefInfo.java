package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2021-06-01
 */
@Data
public class PassengerBriefInfo implements Serializable {

    private static final long serialVersionUID = -4498141218698257692L;

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


    List<SegmentBriefInfo> segmentList;
}
