package com.cloud.shopping.repository.iface;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.dao.SearchRoute;
import com.cloud.shopping.dto.SearchTicketCacheBean;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ShoppingRepository
 * @create: 2024-07-07 17:01
 **/

public interface ShoppingRepository {

    SingleResponse insertShoppingRedis();


}
