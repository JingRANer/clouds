package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Data
public class OrderPassengerResponse {
    public OrderPassengerResponse() {
        orderTicketInfo = new ArrayList<>();
    }

    public void addOrderPassengerInfo(TicketInfo newPassengerInfo) {
        orderTicketInfo.add(newPassengerInfo);
    }

    private String tktNo;
    /**
     * 机票单用户信息（包含航段信息）
     */
    private List<TicketInfo> orderTicketInfo;

    /**
     * 第一程，第二程标记
     */
    private String log;

    /**
     *是否支持多人退
     */
    private Boolean supportRefundMultiPassenger;

    /**
     *是否支持多人改
     */
    private Boolean supportChangeMultiPassenger;

    /**
     * 往返标记
     */
    private String roundTripLog;

    /**
     * 二次改期标记
     */
    private String changeSecondLog;

    /**
     * 是否已取消座位 0未取消 1已取消
     */
    private int opened;

}
