package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: umeticket-shopping-topology
 * @description:客舱服务
 * @author: hzgao
 * @create: 2020-07-21 11:16
 **/
@Data
public class CabinPriority implements Serializable {
    /**
     * 权益名称-详情页展示的数据
     *
     * @mock 机上餐点（产品单独定义的）
     */
    private String info;
    /**
     * 权益详情-将航司具体的权益展示出来
     *
     * @mock 毛毯、机上饮品、机上餐点(仅在餐点时段航班供应)，短长描述间隔
     */
    private List<String> desc;
}
