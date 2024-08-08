package com.cloud.shopping.dao;

import com.cloud.shopping.dto.CabinInfoBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @ClassName : SearchTicketCacheBean
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 14:30
 */
@Data
public class SearchTicketCacheBeanPO {
    private String source;
    private String flightCompany;
    private String flightNo;
    private String hostFlightNo;
    private String flightDate;
    private String destDate;
    private String deptCode;
    private String destCode;
    private String deptAirportName;
    private String destAirportName;
    private String deptCityName;
    private String destCityName;
    private String deptTime;
    private String destTime;
    private String deptTerminal;
    private String destTerminal;
    private String planeTypeDesc;
    private String onTimeRate;
    private String mealDesc;
    private boolean wifi;
    private String spanDayNum;
    private boolean hasStopOver;
    private String flyTime;
//    private List<StopOverBean> stopOverBeanList;
    private int stopOverNum;
    private Map<String, BigDecimal> totalPriceMap;
    private Map<String, BigDecimal> totalChildPriceMap;
    private Map<String, BigDecimal> totalInfantPriceMap;
    private Map<String, BigDecimal> priceMap;
    private Map<String, BigDecimal> childPriceMap;
    private Map<String, BigDecimal> infantPriceMap;
    private BigDecimal airportTax;
    private BigDecimal childAirportTax;
    private BigDecimal infantAirportTax;
    private BigDecimal fuelTax;
    private BigDecimal childFuelTax;
    private BigDecimal infantFuelTax;
    private boolean hasSell;
    private Map<String, String> seatMap;
    private List<CabinInfoBeanPO> cabinInfoBeanList;
    private String flyDistance;
    private String depBusRate;
    private String desBusRate;
    private String delayTime;
    private String flightAge;
    private String depLandWays;
    private String desLandWays;
    private String wifiType;
    private String channel;
    private String deptCityCode;
    private String destCityCode;
    private String updateTime;
    private String expireTime;
}
