package com.cloud.shopping.service;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.ShoppingService;
import com.cloud.shopping.dao.SearchRoute;
import com.cloud.shopping.dto.SearchTicketCacheBean;
import com.cloud.shopping.dto.req.UpdateCacheReq;
import com.cloud.shopping.dto.resp.SearchTicketsByProxyResp;
import com.cloud.shopping.iface.ElasticSearchService;
import com.cloud.shopping.util.Constants;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : ShoppingServiceImpl
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 15:43
 */
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    ElasticSearchService<SearchTicketCacheBean> elasticSearchService;

    @Override
    public SearchTicketsByProxyResp updateCache(UpdateCacheReq req) {
        return null;
    }

    @Override
    public SingleResponse<List<SearchTicketCacheBean>> searchFlight(SearchRoute searchRoute) {

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();


        searchSourceBuilder.query(queryBuilder);

        List<SearchTicketCacheBean> searchTicketCacheBeans = elasticSearchService.query(Constants.SHOP_DATA_INDEX + searchRoute.getDeptDate(), sourceBuilder);
        return SingleResponse.of(searchTicketCacheBeans);

    }
}
