package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: umeticket-shopping-topology
 * @description:地面服务
 * @author: hzgao
 * @create: 2020-07-21 11:16
 **/
@Data
public class GroundPriority implements Serializable {
    private static final long serialVersionUID = -8256391252207917174L;
    /**
     * 权益名称-详情页外层显示
     *
     * @mock 头等舱安检通道
     */
    private String info;
    /**
     * 权益详情-短长描述间隔，如果无长描述，全部为短描述
     *
     * @mock 头等舱安检通道/头等舱休息室
     */
    private List<String> desc;
}
