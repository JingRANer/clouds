package com.cloud.shopping.repository.mysql;

import com.cloud.shopping.builder.CloudAirportMapper;
import com.cloud.shopping.repository.domain.AirportPO;
import com.cloud.shopping.domain.CloudCrawlerAirport;
import com.cloud.shopping.repository.mysql.mappers.CloudBasicdataAirportMapper;
import com.cloud.shopping.repository.mysql.mappers.CloudCrawlerAirportMapper;
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
    public List<AirportPO> getAllAirportCacheBean() {

        List<CloudCrawlerAirport> cloudCrawlerAirports = cloudCrawlerAirportMapper.selectByIsCivil("1");
        return cloudCrawlerAirports.stream().map(c -> builder.toAirportPO(c)).collect(Collectors.toList());
    }
}
