package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.util.List;

@Data
public class FlightAndCabinDetail {

    /**
     * 小字信息
     */
    private FlightDetail flightDetail;

    List<FlightDetail> flightDetailList;
    /**
     * 航班和舱位信息 废弃 不再补充数据
     */
    private AvailableFlightBean availableFlightBean;

    /**
     * 航司二字码
     *
     * @mock 3U
     */
    private String platformAirlineCode;
    /**
     * 航司名称
     *
     * @mock 四川航空
     */
    private String platformAirlineName;

    /**
     * 销售商logo
     *
     * @mock http://img.umetrip.com/fs/shopping/static/110,0b0725aefec69e56
     */
    private String shopLogo;
    /**
     * 可售机票-去程 补全信息
     */
    private TktPriceDetail departureSalableTktPriceDetail;

    public FlightAndCabinDetail() {

    }
}
