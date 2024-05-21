package com.cloud.shopping.dao;

import com.alibaba.fastjson.JSON;
import com.cloud.shopping.iface.ElasticSearchService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ESDaoTest {

//    @Resource
//    ESDao esDao;

    @Test
    public void findByTitle() {
    }

    @Test
    public void findByTitleOrContext() {
    }

    @Test
    public void testFindByTitleOrContext() {
    }


    //通过springboot es向elasticsearch数据库储存一条数据
//    @Test
//    public void testSave() {
//        //创建文档
//        AirportCacheBean article = new AirportCacheBean();
//        //保存文档
//        esDao.save(article);
//
//        Iterable<AirportCacheBean> all = esDao.findAll();
//        for (AirportCacheBean articlenew : all) {
//            System.out.println(articlenew);
//        }
//    }

//
//    //查询所有
//    @Test
//    public void findAll(){
//        Iterable<AirportCacheBean> all = esDao.findAll();
//        for (AirportCacheBean article : all) {
//            System.out.println(article);
//        }
//    }

    @Autowired
    ElasticSearchService elasticSearchService;

    @Test
    public void testRestHighLevelClient() {
        // 查询条件

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();// 大多数的搜索参数被添加到 SearchSourceBuilder 。它为每个进入请求体的每个东西都提供 setter 方法。
        searchSourceBuilder.query(QueryBuilders.matchQuery("IATACODE", "PEK")); // 添加一个 match_all 查询到 searchSourceBuilder 。
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.must(QueryBuilders.termQuery("IATACODE", "PEK"));
        sourceBuilder.query(queryBuilder);
        // 分页查询
        sourceBuilder.from(0);
        sourceBuilder.size(1);

        List<Map<String, Object>> cloudCityAirportIndex = elasticSearchService.list("cloud_city_airport_index", searchSourceBuilder);
        System.out.println(JSON.toJSONString(cloudCityAirportIndex));
    }



}