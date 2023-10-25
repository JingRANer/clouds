package com.cloud.common.proxy.dto.changeorder.transit;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 中转权益信息
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/12 13:33
 */
@Data
public class TransitPriority implements Serializable {
    /**
     * 中转须知类型
     * transit_service_tag+id
     */
    private String type;
    /**
     * 中转须知标题名称
     */
    private String title;
    /**
     * 中转须知描述
     */
    private List<String> desc;
}
