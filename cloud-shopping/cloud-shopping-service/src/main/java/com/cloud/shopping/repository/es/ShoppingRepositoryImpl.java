package com.cloud.shopping.repository.es;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.common.utils.CollectionUtils;
import com.cloud.common.SingleResponse;
import com.cloud.common.util.FileUtil;
import com.cloud.shopping.dao.SearchTicketCacheBeanPO;
import com.cloud.shopping.util.Constants;
import com.cloud.shopping.repository.es.ElasticSearchService;
import com.cloud.shopping.repository.es.ShoppingRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;


/**
 * @author: jingran
 * @Desc:
 * @ClassName: ShoppingRepositoryImpl
 * @create: 2024-07-07 17:56
 **/

@Service
public class ShoppingRepositoryImpl implements ShoppingRepository {

    @Resource(name = "searchTicketEsSvc")
    private ElasticSearchService<SearchTicketCacheBeanPO> elasticSearchService;

    private static final String INDEX_FILE_NAME = "/Users/jingran/Desktop/shoppingData/";
    private static final String INDEX_NAME_SUFFIX = "cloud_shopping_index_";


    @Override
    public SingleResponse insertShoppingRedis(String flightDate) {
        // map结构 没有日期 指定index 按照周指定？
//        boolean insertIndex = insertIndex("20240724");
//        if (!insertIndex) {
//            return null;
//        }
        String readFile = FileUtil.readFile(INDEX_FILE_NAME + "20240724.json");
//        JSONObject jsonObject = JSON.parseObject(readFile);
//        String routeKey = jsonObject.getString("routeKey");
//        String[] splitInfo = routeKey.split(":");
//        String flightDate = splitInfo[5];
//        String routeValue = jsonObject.getString("routeValue");
        Map<String, Map<String, SearchTicketCacheBeanPO>> searchTicketCacheBeanMap = JSON.parseObject(readFile, new TypeReference<Map<String, Map<String, SearchTicketCacheBeanPO>>>() {
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
