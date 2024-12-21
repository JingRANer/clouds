package com.cloud.order.rpc.neo4j.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Order
 * @create: 2024-12-15 22:34
 **/

@Data
public class Order {

    private String orderNo;
    private List<Passenger> passengers;

    private List<Segment> segments;
}
