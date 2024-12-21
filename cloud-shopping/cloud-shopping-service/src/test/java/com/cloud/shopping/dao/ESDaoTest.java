package com.cloud.shopping.dao;

import com.alibaba.fastjson.JSON;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ESDaoTest {


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

    @Test
    public void testRestHighLevelClient() {
        // 查询条件

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();// 大多数的搜索参数被添加到 SearchSourceBuilder 。它为每个进入请求体的每个东西都提供 setter 方法。
        searchSourceBuilder.query(QueryBuilders.matchQuery("iata_code", "PEK")); // 添加一个 match_all 查询到 searchSourceBuilder 。
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.must(QueryBuilders.termQuery("iatacode", "PEK"));
        sourceBuilder.query(queryBuilder);
        // 分页查询
        sourceBuilder.from(0);
        sourceBuilder.size(1);

//        List<Map<String, Object>> cloudCityAirportIndex = elasticSearchService.query("cloud_aircity_index", searchSourceBuilder);
//        System.out.println(JSON.toJSONString(cloudCityAirportIndex));
    }


    @Test
    public void update(){
        String test = "{\n" +
                "    \"iata_code\": \"PEK\",\n" +
                "    \"city_code\": \"BJS\",\n" +
                "    \"country_code\": \"CN\",\n" +
                "    \"iata_name\": \"首都机场\",\n" +
                "    \"iata_alias\": \"北京首都\",\n" +
                "    \"iata_full_name\": \"北京首都机场\",\n" +
                "    \"iata_pinyin\": \"beijingshouduguojijichang\",\n" +
                "    \"iata_pinyin_short\": \"bjsdgjjc\",\n" +
                "    \"city_name\": \"北京\",\n" +
                "    \"city_pinyin\": \"BeiJing\",\n" +
                "    \"city_pinyin_short\": \"bj\",\n" +
                "    \"provincename\": \"北京\",\n" +
                "    \"provincename_pinyin\": \"北京\",\n" +
                "    \"country_name\": \"中国\",\n" +
                "    \"country_pinyin\": \"中国\",\n" +
                "    \"iscivil\": true,\n" +
                "    \"location\":\n" +
                "    {\n" +
                "        \"lon\": 116.587095,\n" +
                "        \"lat\": 40.078538\n" +
                "    }\n" +
                "}";
        AirportCacheBean airportCacheBean = JSON.parseObject(test, AirportCacheBean.class);
//        elasticSearchService.update("cloud_aircity_index", airportCacheBean);
    }

}