package com.cloud.shopping.repository.impl;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResponse;
import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.iface.ElasticSearchService;
import com.cloud.shopping.repository.iface.AirportInfoRepository;
import com.cloud.shopping.repository.iface.AirportInfoService;
import com.cloud.shopping.util.ElasticsearchConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
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
    ElasticSearchService elasticSearchService;

    @Resource
    AirportInfoRepository airportInfoRepository;

    String AIRPORT_INDEX_NAME = "cloud_aircity_index";

    @Override
    public List<AirportCacheBean> getAirportCacheBeans(String reqStr) {
        try {
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

            BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();


            searchSourceBuilder.query(queryBuilder);
            queryBuilder.should(QueryBuilders.termQuery("iata_code", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("city_code", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("iata_alias", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("iata_name", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("iata_pinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("iata_pinyin_short", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("city_name", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("city_pinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("city_pinyin_short", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("provincename", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("provincename_pinyin", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("country_name", reqStr));
            queryBuilder.should(QueryBuilders.termQuery("country_pinyin", reqStr));
            sourceBuilder.from(0);
            sourceBuilder.size(1);
            List<Map<String, Object>> cloudCityAirportIndex = elasticSearchService.list(AIRPORT_INDEX_NAME, searchSourceBuilder);
            List<AirportCacheBean> airportCacheBeans = cloudCityAirportIndex.stream().map(stringObjectMap ->
                    JSON.parseObject(JSON.toJSONString(stringObjectMap), AirportCacheBean.class)).collect(Collectors.toList());
            return airportCacheBeans;
        } catch (Exception e) {
            log.error("getAirportCacheBeans", e);
            return null;
        }
    }

    @Override
    public SingleResponse insertAllAirportCacheBean() {
        List<AirportCacheBean> allAirportCacheBean = airportInfoRepository.getAllAirportCacheBean();
        allAirportCacheBean.forEach(a -> elasticSearchService.update(AIRPORT_INDEX_NAME, a));
        return SingleResponse.buildSuccess();
    }
}
