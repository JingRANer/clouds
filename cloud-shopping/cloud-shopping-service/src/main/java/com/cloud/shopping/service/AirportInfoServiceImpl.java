package com.cloud.shopping.service;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.repository.domain.AirportEsPO;
import com.cloud.shopping.repository.domain.AirportPO;
import com.cloud.shopping.repository.es.ElasticSearchService;
import com.cloud.shopping.repository.mysql.AirportInfoRepository;
import com.cloud.shopping.iface.AirportInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportInfoServiceImpl
 * @create: 2024-05-29 10:28
 **/

@Slf4j
@Service
public class AirportInfoServiceImpl implements AirportInfoService {

    @Resource(name = "airportEsSvc")
    ElasticSearchService<AirportEsPO> airportEsSvc;

    @Resource
    AirportInfoRepository airportInfoRepository;

    String AIRPORT_INDEX_NAME = "cloud_aircity_index";

    @Override
    public List<AirportEsPO> getAirportByStr(String reqStr) {
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
            List<AirportEsPO> airportCacheBeans = airportEsSvc.query(AIRPORT_INDEX_NAME, searchSourceBuilder);
            return airportCacheBeans;
        } catch (Exception e) {
            log.error("getAirportCacheBeans", e);
            return null;
        }
    }

    @Override
    public SingleResponse insertAllAirportCacheBean() {
        List<AirportPO> AirportEsPOS = airportInfoRepository.getAllAirportCacheBean();
        AirportEsPOS.forEach(a -> airportEsSvc.update(AIRPORT_INDEX_NAME, a));
        return SingleResponse.buildSuccess();
    }

    public List<AirportEsPO> queryAllAirportList() {

        MatchAllQueryBuilder matchAllQueryBuilder = QueryBuilders.matchAllQuery();

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(matchAllQueryBuilder);
        searchSourceBuilder.size(2000);
        List<AirportEsPO> AirportEsPOS = airportEsSvc.queryAll(AIRPORT_INDEX_NAME, searchSourceBuilder);
        return AirportEsPOS;
    }
}
