package com.cloud.shopping.repository.impl;

import com.cloud.shopping.builder.CloudAirportMapper;
import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.domain.CloudCrawlerAirport;
import com.cloud.shopping.repository.iface.AirportInfoRepository;
import com.cloud.shopping.repository.mappers.CloudBasicdataAirportMapper;
import com.cloud.shopping.repository.mappers.CloudCrawlerAirportMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportInfoRepositoryImpl
 * @create: 2024-06-20 18:00
 **/

@Service
public class AirportInfoRepositoryImpl implements AirportInfoRepository {
    @Resource
    CloudBasicdataAirportMapper cloudBasicdataAirportMapper;

    @Resource
    CloudCrawlerAirportMapper cloudCrawlerAirportMapper;

    private static CloudAirportMapper builder = CloudAirportMapper.INSTANCE;


    @Override
    public List<AirportCacheBean> getAllAirportCacheBean() {

        List<CloudCrawlerAirport> cloudCrawlerAirports = cloudCrawlerAirportMapper.selectByIsCivil("1");
        return cloudCrawlerAirports.stream().map(c -> builder.toAirportCacheBean(c)).collect(Collectors.toList());
    }
}
