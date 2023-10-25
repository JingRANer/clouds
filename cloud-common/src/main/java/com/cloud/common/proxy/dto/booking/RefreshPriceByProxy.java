package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2020/12/10
 */
@Data
public class RefreshPriceByProxy implements Serializable {

    private static final long serialVersionUID = 1608383741199041586L;

    private Double adultTktPrice;
    private Double childTktPrice;
    private Double infantTktPrice;
    private Double adultTaxPrice;
    private Double childTaxPrice;
    private Double infantTaxPrice;
    private Double adultTotalPrice;
    private Double childTotalPrice;
    private Double infantTotalPrice;
    private String flightNo;
    private String flightDate;
    private String cabin;
    private String roundTrip;
}
