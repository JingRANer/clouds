package com.cloud.shopping.repository.impl;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.dao.ESDaoTest;
import com.cloud.shopping.iface.AirportInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AirportInfoServiceImplTest extends ESDaoTest {
    @Autowired
    AirportInfoService airportInfoService;

    @Test
    public void test() {
        List<AirportCacheBean> airportCacheBeans = airportInfoService.getAirportCacheBeans("北京");
        System.out.println(airportCacheBeans);
    }
    @Test
    public void testInsert() {
        SingleResponse singleResponse = airportInfoService.insertAllAirportCacheBean();
        assert singleResponse.isSuccess();
    }


}