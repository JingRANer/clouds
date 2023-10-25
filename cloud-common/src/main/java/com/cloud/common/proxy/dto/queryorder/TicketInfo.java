package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2022/3/24
 */
@Data
public class TicketInfo {


    /**
     * 乘客信息
     */
    private PassengerInfo passengerInfo;

    /**
     * 航段信息列表
     */
    private List<SegmentInfo> segmentInfoList;

    /**
     * 客票号
     */
    private String tktNo;

}
