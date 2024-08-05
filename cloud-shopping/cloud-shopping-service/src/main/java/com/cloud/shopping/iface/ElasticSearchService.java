package com.cloud.shopping.iface;

import com.cloud.common.SingleResponse;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.List;
import java.util.Map;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ElasticSearchService
 * @create: 2024-05-19 18:47
 **/

public interface ElasticSearchService<T> {
    List<T> query(String indexName, SearchSourceBuilder sourceBuilder);


    SingleResponse update(String indexName, Object obj);

    SingleResponse insertIndex(String indexName, String jsonTemplate);

    SingleResponse insert(String indexName, Object object);
}
