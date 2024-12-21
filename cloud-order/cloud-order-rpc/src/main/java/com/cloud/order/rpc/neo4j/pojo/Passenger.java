package com.cloud.order.rpc.neo4j.pojo;

import lombok.Data;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Passenger
 * @create: 2024-12-15 22:34
 **/

@Data
public class Passenger {

    private String passengerId;

    /**
     * 唯一身份表示
     */
    private String psgUid;


}
