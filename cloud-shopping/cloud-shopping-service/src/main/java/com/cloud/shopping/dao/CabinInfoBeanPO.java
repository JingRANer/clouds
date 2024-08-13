package com.cloud.shopping.dao;

import com.cloud.shopping.dto.RefundChangeInfo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName : CabinInfoBean
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 14:31
 */
@Data
public class CabinInfoBeanPO {
    private static final long serialVersionUID = -5745436810407923821L;
    private String bigCabin;
    private String cabin;
    private String cabinDesc;
    private String discount;
    private BigDecimal price;
    private BigDecimal childPrice;
    private BigDecimal infantPrice;
    private String seats;
    private boolean supportChild;
    private boolean supportInfant;
    private String remark;
    private String freeBaggage;
    private boolean hasSell;
    private String cabinProperty;
    private String midCabin;
    private PriorityPO cabinPriority;
    private RefundChangeInfoPO refundChangeInfo;
    private String cabinProduct;
    private String flightNo;
    private BigDecimal airportTax;
    private BigDecimal childAirportTax;
    private BigDecimal infantAirportTax;
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
