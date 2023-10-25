package com.cloud.shopping.proxy;

import com.cloud.shopping.proxy.domain.request.ShoppingProxyReq;
import com.umetrip.air.proxy.service.dto.shopping.response.ShoppingResp;
import com.umetrip.uframe.common.dto.response.SingleResponse;

/**
 * @ClassName : ShoppingService
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-24 18:46
 */
public interface ShoppingProxyService {

    SingleResponse<ShoppingResp> shoppingFromProxy(ShoppingProxyReq proxyReq);

}
