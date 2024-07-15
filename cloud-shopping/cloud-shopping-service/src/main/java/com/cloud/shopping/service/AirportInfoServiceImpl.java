package com.cloud.shopping.service;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResponse;
import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.iface.ElasticSearchService;
import com.cloud.shopping.repository.iface.AirportInfoRepository;
import com.cloud.shopping.iface.AirportInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportInfoServiceImpl
 * @create: 2024-05-29 10:28
 **/

@Slf4j
@Service
public class AirportInfoServiceImpl implements AirportInfoService {

    @Autowired
    ElasticSearchService<AirportCacheBean> elasticSearchService;

    @Resource
    AirportInfoRepository airportInfoRepository;

    String AIRPORT_INDEX_NAME = "cloud_airport_info_index";

    @Override
    public List<AirportCacheBean> getAirportCacheBeans(String reqStr) {
        try {
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

            BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();


            searchSourceBuilder.query(queryBuilder);
            queryBuilder.should(QueryBuilders.termQuery("iatacode", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("citycode", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("iataalias", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("airportname", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("airportpinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("airportpinyinshort", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("cityname", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("citypinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("citypinyinshort", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("provincename", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("provincenamepinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("countryname", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("countrypinyin", reqStr));
            sourceBuilder.from(0);
            sourceBuilder.size(1);
            List<AirportCacheBean> airportCacheBeans = elasticSearchService.query(AIRPORT_INDEX_NAME, searchSourceBuilder);
            return airportCacheBeans;
        } catch (Exception e) {
            log.error("getAirportCacheBeans", e);
            return null;
        }
    }

    @Override
    public SingleResponse insertAllAirportCacheBean() {
        List<AirportCacheBean> allAirportCacheBean = airportInfoRepository.getAllAirportCacheBean();
        allAirportCacheBean.forEach(a -> {
            a.setCountrypinyin(a.getCountryname());
            a.setProvincenamepinyin(a.getProvincename());
            a.setIscivil(true);
            if(!StringUtils.isAnyBlank(a.getLongitude(), a.getLatitude())) {
                a.setLocation(new GeoPoint(Double.valueOf(a.getLatitude()), Double.valueOf(a.getLongitude())));
            }

            elasticSearchService.update(AIRPORT_INDEX_NAME, a);
        });
        return SingleResponse.buildSuccess();
    }
}
