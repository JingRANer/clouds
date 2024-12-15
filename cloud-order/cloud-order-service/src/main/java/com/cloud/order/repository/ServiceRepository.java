package com.cloud.order.repository;

import com.cloud.order.repository.po.CloudAirService;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ServiceRepository
 * @create: 2024-07-15 23:17
 **/


public interface ServiceRepository {


    int executeInsert(String sql, String fileName);


    List<CloudAirService> findByOrderNo(String orderNo);
}
