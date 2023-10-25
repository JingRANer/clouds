package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class OrderSegmentInfo implements Serializable {

    private static final long serialVersionUID = 7265250432208053481L;

    /**
     * 去程信息
     */
    private List<FlightTktInfo> departureFlightTicketList;

    /**
     * 返程信息
     */
    private List<FlightTktInfo> returnFlightTicketList;

    /**
     * 去程头信息
     */
    private TripHeadInfoBean departureHeadTrip;
    /**
     * 返程头信息
     */
    private TripHeadInfoBean returnHeadTrip;
}

