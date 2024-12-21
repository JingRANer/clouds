package com.cloud.shopping.builder;

import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.repository.domain.AirportPO;
import com.cloud.shopping.domain.CloudCrawlerAirport;
import com.cloud.shopping.dto.Airport;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.geo.GeoPoint;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
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


//    @Mapping(target = "", source = "code")
    public AirportCacheBean toAirportCacheBean(CloudCrawlerAirport cloudCrawlerAirport);


    @Mapping(target = "iscivil", expression = "java(Boolean.TRUE)")
    @Mapping(target = "countrypinyin", source = "countryname")
    @Mapping(target = "provincenamepinyin", source = "provincename")
    AirportPO toAirportPO(CloudCrawlerAirport cloudCrawlerAirport);

    default void transferLocation(@MappingTarget AirportPO airportPO, CloudCrawlerAirport cloudCrawlerAirport) {
        if(!StringUtils.isAnyBlank(cloudCrawlerAirport.getLongitude(), cloudCrawlerAirport.getLatitude())) {
            airportPO.setLocation(new GeoPoint(Double.valueOf(cloudCrawlerAirport.getLatitude()), Double.valueOf(cloudCrawlerAirport.getLongitude())));
        }
    }
    Airport toAirport(AirportCacheBean airportCacheBean);
}
