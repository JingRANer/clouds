package com.cloud.shopping.builder;

import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.domain.CloudCrawlerAirport;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: CloudAirportMapper
 * @create: 2024-06-23 17:00
 **/

@Mapper
public interface CloudAirportMapper {

    public static CloudAirportMapper INSTANCE = Mappers.getMapper(CloudAirportMapper.class);


    public AirportCacheBean toAirportCacheBean(CloudCrawlerAirport cloudCrawlerAirport);
}
