package com.cloud.shopping.repository.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.cloud.common.SingleResponse;
import com.cloud.common.util.FileUtil;
import com.cloud.shopping.dto.SearchTicketCacheBean;
import com.cloud.shopping.util.Constants;
import com.cloud.shopping.iface.ElasticSearchService;
import com.cloud.shopping.repository.iface.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * @author: jingran
 * @Desc:
 * @ClassName: ShoppingRepositoryImpl
 * @create: 2024-07-07 17:56
 **/

@Service
public class ShoppingRepositoryImpl implements ShoppingRepository {

    @Autowired
    ElasticSearchService elasticSearchService;


    @Override
    public SingleResponse insertShoppingRedis() {
        int n = 1;
        for (int i = 0; i < n; i++) {

            // map结构 没有日期 指定index 按照周指定？
            String readFile = FileUtil.readFile("/Users/jingran/Desktop/shoppingData/1.json");
            JSONObject jsonObject = JSON.parseObject(readFile);
            String routeKey = jsonObject.getString("routeKey");
            String[] splitInfo = routeKey.split(":");
            String flightDate = splitInfo[5];
            String routeValue = jsonObject.getString("routeValue");
            Map<String, SearchTicketCacheBean> searchTicketCacheBeanMap = JSON.parseObject(routeValue, new TypeReference<Map<String, SearchTicketCacheBean>>() {
            }.getType());
            searchTicketCacheBeanMap.values().forEach(searchTicketCacheBean -> {
                elasticSearchService.update(Constants.SHOP_DATA_INDEX + flightDate, searchTicketCacheBean);

            });
        }
        return SingleResponse.buildSuccess();
    }

}
