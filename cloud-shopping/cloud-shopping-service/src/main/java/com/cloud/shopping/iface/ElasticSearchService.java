package com.cloud.shopping.iface;

import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.List;
import java.util.Map;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ElasticSearchService
 * @create: 2024-05-19 18:47
 **/

public interface ElasticSearchService {
    List<Map<String, Object>> list(String indexName, SearchSourceBuilder sourceBuilder) ;
}
