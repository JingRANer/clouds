package com.cloud.shopping.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.shopping.repository.domain.AirportEsPO;
import com.cloud.shopping.repository.domain.AirportPO;
import com.cloud.shopping.dto.Airport;
import com.cloud.shopping.iface.AirportInfoService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportController
 * @create: 2024-12-17 20:12
 **/


@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    AirportInfoService airportInfoService;

    @GetMapping("/{code}")
    public List<Airport> queryAirport(@PathVariable("code") String code) {
        List<AirportEsPO> airportCacheBeans = airportInfoService.getAirportByStr(code);
        List<Airport> airports = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(airportCacheBeans)) {
            for (AirportEsPO airportEsPO : airportCacheBeans) {
                String desc = JSON.toJSONString(airportEsPO);
                Airport airport = JSON.parseObject(desc, Airport.class);
                if (airportEsPO.getLocation() != null) {
                    airport.setLongtitue(String.valueOf(airportEsPO.getLocation().getLon()));
                    airport.setLatitude(String.valueOf(airportEsPO.getLocation().getLat()));
                }
                airports.add(airport);
            }
        }
        return airports;
    }


    @GetMapping("/allairport")
    public List<Airport> queryAllAirport() {
        List<Airport> airports = new ArrayList<>();
        List<AirportEsPO> airportList = airportInfoService.queryAllAirportList();
        if (CollectionUtils.isNotEmpty(airportList)) {
            for (AirportEsPO airportEsPO : airportList) {
                String desc = JSON.toJSONString(airportEsPO);
                Airport airport = JSON.parseObject(desc, Airport.class);
                if (airportEsPO.getLocation() != null) {
                    airport.setLongtitue(String.valueOf(airportEsPO.getLocation().getLon()));
                    airport.setLatitude(String.valueOf(airportEsPO.getLocation().getLat()));
                }
                airports.add(airport);
            }
        }

        return airports;
    }
}
