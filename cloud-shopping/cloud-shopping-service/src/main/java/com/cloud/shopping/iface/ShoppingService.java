package com.cloud.shopping.iface;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.dao.SearchRoute;
import com.cloud.shopping.dto.SearchTicketCacheBean;
import com.cloud.shopping.dto.req.UpdateCacheReq;
import com.cloud.shopping.dto.resp.SearchTicketsByProxyResp;

import java.util.List;

/**
 * @ClassName : ShoppingService
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 13:29
 */
public interface ShoppingService {


    // 缓存查询
    // 列表航班展示数据整合
    // 缓存更新
    // 舱位数据
    // 退改签规则
    // 确认预订是否需要再加

    SearchTicketsByProxyResp updateCache(UpdateCacheReq req);

//    TicketCacheUpdateBatchResp getShoppingListCache(TicketCacheUpdateBatchReq req);


    SingleResponse<List<SearchTicketCacheBean>> searchFlight(SearchRoute searchRoute);

}
