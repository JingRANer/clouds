package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.booking.TicketSegmentInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderSegment implements Serializable {

    /**
     * 去程航段
     */
    private List<TicketSegmentInfo> departureSegments;


    /**
     * 回程航段
     */
    private List<TicketSegmentInfo> returnSegments;
}
