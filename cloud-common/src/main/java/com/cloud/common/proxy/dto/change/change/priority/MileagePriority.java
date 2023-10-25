package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName : MileagePriority
 * @Description : 里程权益
 * @Author : jzy
 * @Date: 2020-11-02 11:29
 */
@Data
public class MileagePriority implements Serializable {
    /**
     * 权益名称-详情页外层显示
     *
     * @mock 1234里程/积分
     */
    private String info;
    /**
     * 权益详情-短长描述间隔，如果无长描述，直接放短描述
     *
     * @mock 无餐食
     */
    private List<String> desc;
}
