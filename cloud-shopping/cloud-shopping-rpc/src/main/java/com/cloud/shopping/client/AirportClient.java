package com.cloud.shopping.client;

import com.cloud.shopping.dto.Airport;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportClient
 * @create: 2024-12-17 20:18
 **/

@Component
@FeignClient(value = "cloud-shopping-service")
public interface AirportClient {
    @GetMapping("/airport/{code}")
     List<Airport> queryAirport(@PathVariable("code") String code);

    @GetMapping("/airport/allairport")
    List<Airport> queryAllAirport();
}
