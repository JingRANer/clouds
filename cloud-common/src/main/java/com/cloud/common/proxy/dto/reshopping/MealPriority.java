package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: umeticket-shopping-topology
 * @description:餐食服务
 * @author: hzgao
 * @create: 2020-07-21 11:16
 **/
@Data
public class MealPriority implements Serializable {
    private static final long serialVersionUID = 7735341747989608630L;
    /**
     * 权益名称-详情页外层显示
     *
     * @mock 无餐食
     */
    private String info;
    /**
     * 权益详情-短长描述间隔，如果无长描述，直接放短描述
     *
     * @mock 无餐食
     */
    private List<String> desc;
}
