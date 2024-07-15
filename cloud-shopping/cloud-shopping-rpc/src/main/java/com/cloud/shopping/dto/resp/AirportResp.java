package com.cloud.shopping.dto.resp;

import com.cloud.shopping.dto.Airport;
import lombok.Data;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportResp
 * @create: 2024-07-07 16:54
 **/

@Data
public class AirportResp {

    List<Airport> airportList;
}
