package com.cloud.shopping.proxy.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cloud.common.Constants;
import com.cloud.shopping.builder.ShoppingProxyBuilder;
import com.cloud.shopping.proxy.ShoppingProxyService;
import com.cloud.shopping.proxy.domain.request.ShoppingProxyReq;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : ShoppingProxyServiceImpl
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 09:43
 */
@Service("shoppingService")
public class ShoppingProxyServiceImpl implements ShoppingProxyService {
    private static final ShoppingProxyBuilder shoppingProxyBuilder = ShoppingProxyBuilder.INSTANCE;
//
//    @Reference(check = false)
//    ShoppingService shoppingService;

//    @Override
//    public SingleResponse<ShoppingResp> shoppingFromProxy(ShoppingProxyReq proxyReq) {
//        ShoppingReq shoppingReq = shoppingProxyBuilder.toShoppingReq(proxyReq);
//        //中转和直达一起返回
//        shoppingReq.setJourneyType(Constants.JOURNEY_ONEWAY);
//        return shoppingService.queryFlightList(shoppingReq);
//    }
}
