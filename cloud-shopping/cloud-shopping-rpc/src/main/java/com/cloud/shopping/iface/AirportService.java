package com.cloud.shopping.iface;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.dto.Airport;
import com.cloud.shopping.dto.resp.AirportResp;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportService
 * @create: 2024-07-07 16:54
 **/

public interface AirportService {

    AirportResp getAirportList(String reqStr);

    SingleResponse<Airport> getAirport(String airportCode);
    AirportResp getAirportListByCity(String cityCode);
}
