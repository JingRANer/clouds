package com.cloud.common.proxy.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UnableBookingCertInfo {
    /**
     * 航司
     */
    private String airline;
    /**
     * 证件类型
     */
    private List<String> certType;
    /**
     * 往返程标识
     */
    private String roundTrip;
}
