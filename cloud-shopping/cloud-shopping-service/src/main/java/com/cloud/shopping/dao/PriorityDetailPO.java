package com.cloud.shopping.dao;

import lombok.Data;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: PriorityDetailPO
 * @create: 2024-08-08 15:39
 **/

@Data
public class PriorityDetailPO {
    /**
     * 权益名称
     */
    private String info;
    /**
     * 权益详情
     */
    private String description;
    private List<String> descriptionList;
}
