package com.cloud.order.repository;

import org.bouncycastle.asn1.ocsp.SingleResponse;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: OrderRepository
 * @create: 2024-07-15 23:17
 **/

public interface OrderRepository<T> {

    public SingleResponse createOrder(T order);

    public T findByOrderNo(String orderNo);

    public List<T> findByUserId(String userId);
}
