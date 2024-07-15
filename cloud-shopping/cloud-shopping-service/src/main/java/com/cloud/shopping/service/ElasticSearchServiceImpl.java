package com.cloud.shopping.service;

//import com.cloud.shopping.util.ElasticSearchConfig;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.cloud.common.SingleResponse;
import com.cloud.shopping.iface.ElasticSearchService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ElasticSearchServiceImpl
 * @create: 2024-05-19 18:17
 **/

@Slf4j
@Service("elasticSearchService")
public class ElasticSearchServiceImpl<T> implements ElasticSearchService {
    @Resource(name = "restHighLevelClient")
    private RestHighLevelClient client;

    private final RequestOptions options = RequestOptions.DEFAULT;


    /**
     * 创建索引，并设置选项
     *
     * @param index 索引名称
     */
    public CreateIndexResponse createIndex(String index) {
        CreateIndexRequest request = new CreateIndexRequest(index);

        Map<String, Object> user = new HashMap<String, Object>();
        user.put("type", "text");
        user.put("analyzer", "ik_max_word");
        user.put("search_analyzer", "ik_max_word");

        Map<String, Object> title = new HashMap<String, Object>();
        title.put("type", "text");
        title.put("analyzer", "ik_max_word");
        title.put("search_analyzer", "ik_max_word");

        Map<String, Object> desc = new HashMap<String, Object>();
        desc.put("type", "text");
        desc.put("analyzer", "ik_max_word");
        desc.put("search_analyzer", "ik_max_word");

        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("title", title);
        properties.put("user", user );
        properties.put("desc", desc);

        Map<String, Object> mapping = new HashMap<String, Object>();
        mapping.put("properties", properties);

        request.mapping("aircity", mapping);

//        try {
////            return client.indices().create(request, RequestOptions.DEFAULT);
//        } catch (IOException e) {
//            System.out.println(e);
//            log.error("Index Creat Error:{}", e.getMessage());
//        }

        return null;
    }


    /**
     * 查询数据集
     */
    public List<T> query(String indexName, SearchSourceBuilder sourceBuilder) {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.source(sourceBuilder);
        try {
            SearchResponse searchResp = client.search(searchRequest, options);
            List<T> data = new ArrayList<>();
            SearchHit[] searchHitArr = searchResp.getHits().getHits();
            for (SearchHit searchHit : searchHitArr) {
                Map<String, Object> temp = searchHit.getSourceAsMap();
                T obj = JSON.parseObject(JSON.toJSONString(temp), new TypeReference<T>() {
                }.getType());
                temp.put("id", searchHit.getId());
                data.add(obj);
            }
            return data;
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public SingleResponse update(String indexName, Object obj) {
        try {
            IndexRequest request = new IndexRequest();
            request.index(indexName);


            //向ES中插入数据，必须将数据格式转换为JSON
            ObjectMapper objectMapper = new ObjectMapper();
            request.source(objectMapper.writeValueAsString(obj), XContentType.JSON);
            IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
            System.out.println(JSON.toJSONString(indexResponse));

        } catch (IOException e) {
            System.out.println(JSON.toJSONString(obj));
            log.error("update", e);
        }
        return null;
    }
}
