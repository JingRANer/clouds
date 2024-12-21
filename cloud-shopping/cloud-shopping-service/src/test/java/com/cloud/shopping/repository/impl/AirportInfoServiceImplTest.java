package com.cloud.shopping.repository.impl;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.repository.domain.AirportEsPO;
import com.cloud.shopping.dao.ESDaoTest;
import com.cloud.shopping.iface.AirportInfoService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class AirportInfoServiceImplTest extends ESDaoTest {
    @Resource
    AirportInfoService airportInfoService;

    @Test
    public void test() {
        List<AirportEsPO> airportCacheBeans = airportInfoService.getAirportByStr("北京");
        System.out.println(airportCacheBeans);
    }
    @Test
    public void testInsert() {
        SingleResponse singleResponse = airportInfoService.insertAllAirportCacheBean();
        assert singleResponse.isSuccess();
    }

    @Test
    public void testAll() {
        List<AirportEsPO> airportCacheBeans = airportInfoService.queryAllAirportList();
        System.out.println(airportCacheBeans);
    }


}