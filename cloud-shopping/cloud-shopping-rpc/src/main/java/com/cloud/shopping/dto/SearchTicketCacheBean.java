package com.cloud.shopping.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName : SearchTicketCacheBean
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 14:30
 */
@Data
public class SearchTicketCacheBean {
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
    private Map<String, String> totalPriceMap;
    private Map<String, String> totalChildPriceMap;
    private Map<String, String> totalInfantPriceMap;
    private Map<String, String> priceMap;
    private Map<String, String> childPriceMap;
    private Map<String, String> infantPriceMap;
    private String airportTax;
    private String childAirportTax;
    private String infantAirportTax;
    private String fuelTax;
    private String childFuelTax;
    private String infantFuelTax;
    private String context;
    private String regNo;
    private boolean hasSell;
    private Map<String, String> seatMap;
    private Set<String> next;
    private List<CabinInfoBean> cabinInfoBeanList;
    private String flyDistance;
    private String depBusRate;
    private String desBusRate;
    private String delayTime;
    private Map<String, String> totalMemberPriceMap;
    private Map<String, String> memberPriceMap;
    private String flightAge;
    private String depLandWays;
    private String desLandWays;
    private String wifiType;
    private Map<String, CabinInfoBean> priceCabinMap;
    private Map<String, CabinInfoBean> childPriceCabinMap;
    private Map<String, CabinInfoBean> infantPriceCabinMap;
    private String channel;
    private String deptCityCode;
    private String destCityCode;
    private String updateTime;
    private String expireTime;
    private String segmentsContext;
}
