package com.cloud.shopping.service;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.iface.ShoppingService;
import com.cloud.shopping.dao.SearchRoute;
import com.cloud.shopping.dto.SearchTicketCacheBean;
import com.cloud.shopping.dto.req.UpdateCacheReq;
import com.cloud.shopping.dto.resp.SearchTicketsByProxyResp;
import com.cloud.shopping.repository.es.ElasticSearchService;
import com.cloud.shopping.util.Constants;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName : ShoppingServiceImpl
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 15:43
 */
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Resource(name = "searchTicketEsSvc")
    ElasticSearchService<SearchTicketCacheBean> searchTicketEsSvc;

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

        List<SearchTicketCacheBean> searchTicketCacheBeans = searchTicketEsSvc.query(Constants.SHOP_DATA_INDEX + searchRoute.getDeptDate(), sourceBuilder);
        return SingleResponse.of(searchTicketCacheBeans);

    }
}
