package com.cloud.order.repository.impl;

import com.cloud.order.domain.CloudSaleOrder;
import com.cloud.order.repository.OrderRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: OrderRepositoryimpl
 * @create: 2024-07-15 23:23
 **/

@Service
@Slf4j
public class OrderRepositoryimpl implements OrderRepository<CloudSaleOrder> {
    @Override
    public SingleResponse createOrder(CloudSaleOrder order) {
        return null;
    }

    @Override
    public CloudSaleOrder findByOrderNo(String orderNo) {
        return null;
    }

    @Override
    public List<CloudSaleOrder> findByUserId(String userId) {
        return null;
    }
}
