package com.cloud.shopping.repository.impl;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.BaseTest;
import com.cloud.shopping.repository.es.ShoppingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ShoppingRepositoryImplTest extends BaseTest {
    @Autowired
    ShoppingRepository shoppingRepository;

    @Test
    void insertShoppingRedis() {
        SingleResponse singleResponse = shoppingRepository.insertShoppingRedis("20240724");
        assert  singleResponse.isSuccess();
    }

    @Test
    public void testCreateData() {
        String flightDate = "20240724";
        boolean indexInsertResp = shoppingRepository.insertIndex(flightDate);
        if(indexInsertResp) {
            SingleResponse singleResponse = shoppingRepository.insertShoppingRedis(flightDate);
            assert  singleResponse.isSuccess();
        }
        assert  indexInsertResp;
    }
}