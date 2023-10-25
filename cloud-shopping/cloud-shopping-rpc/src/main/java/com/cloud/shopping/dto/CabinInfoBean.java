package com.cloud.shopping.dto;

import lombok.Data;

/**
 * @ClassName : CabinInfoBean
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 14:31
 */
@Data
public class CabinInfoBean {
    private static final long serialVersionUID = -5745436810407923821L;
    private String bigCabin;
    private String cabin;
    private String cabinDesc;
    private String discount;
    private String price;
    private String childPrice;
    private String infantPrice;
    private String seats;
    private boolean supportChild;
    private boolean supportInfant;
    private String remark;
    private String freeBaggage;
    private String context;
    private boolean hasSell;
    private String memberPrice;
    private String cabinProperty;
    private String midCabin;
//    private Priority cabinPriority;
//    private RefundChangeInfo refundChangeInfo;
    private String cabinProduct;
    private String flightNo;
    private String airportTax;
    private String childAirportTax;
    private String infantAirportTax;
    private String fuelTax;
    private String childFuelTax;
    private String infantFuelTax;
    private String source;
    private String hostFlightNo;
    private String oriCabinKey;
//    private List<ConfigPriority> configPriorityList;
    private String channel;
    private boolean notSameClass;
}
