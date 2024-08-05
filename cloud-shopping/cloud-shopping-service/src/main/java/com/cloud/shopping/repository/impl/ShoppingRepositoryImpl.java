package com.cloud.shopping.repository.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.common.utils.CollectionUtils;
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
    private ElasticSearchService<SearchTicketCacheBean> elasticSearchService;

    private static final String INDEX_FILE_NAME = "/Users/jingran/Desktop/shoppingData/";
    private static final String INDEX_NAME_SUFFIX = "cloud_shopping_index_";


    @Override
    public SingleResponse insertShoppingRedis() {
        // map结构 没有日期 指定index 按照周指定？
//        boolean insertIndex = insertIndex("20240724");
//        if (!insertIndex) {
//            return null;
//        }
        String readFile = FileUtil.readFile(INDEX_FILE_NAME + "2024-07-24.json");
        JSONObject jsonObject = JSON.parseObject(readFile);
//        String routeKey = jsonObject.getString("routeKey");
//        String[] splitInfo = routeKey.split(":");
//        String flightDate = splitInfo[5];
//        String routeValue = jsonObject.getString("routeValue");
        Map<String, Map<String, SearchTicketCacheBean>> searchTicketCacheBeanMap = JSON.parseObject(readFile, new TypeReference<Map<String, Map<String, SearchTicketCacheBean>>>() {
        }.getType());
        searchTicketCacheBeanMap.values().forEach(map -> {
            if (CollectionUtils.isEmpty(map.values())) {
                return;
            }
            map.values().forEach(searchTicketCacheBean -> {
                if (searchTicketCacheBean != null && CollectionUtils.isNotEmpty(searchTicketCacheBean.getCabinInfoBeanList())) {
                    elasticSearchService.update(Constants.SHOP_DATA_INDEX + "20240724", searchTicketCacheBean);
                }


            });
        });

        return SingleResponse.buildSuccess();
    }

    public boolean insertIndex(String flightDate) {
        String readFile = FileUtil.readFile(INDEX_FILE_NAME + "index1.json");

        // 创建 index
        SingleResponse singleResponse = elasticSearchService.insertIndex(INDEX_NAME_SUFFIX + flightDate, readFile);
        return singleResponse.isSuccess();
    }
}
