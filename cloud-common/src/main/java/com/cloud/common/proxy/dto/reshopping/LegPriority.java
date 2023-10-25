package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName : LegPriority
 * @Description : 定级航段信息
 * @Author : jzy
 * @Date: 2020-11-02 11:36
 */
@Data
public class LegPriority implements Serializable {
    private static final long serialVersionUID = 2730516486843469270L;

    /**
     * 权益名称-详情页外层显示
     *
     * @mock 1.0定级航段
     */
    private String info;
    /**
     * 权益详情-短长描述间隔，如果无长描述，直接放短描述
     *
     * @mock 1.0定级航段
     */
    private List<String> desc;
}
