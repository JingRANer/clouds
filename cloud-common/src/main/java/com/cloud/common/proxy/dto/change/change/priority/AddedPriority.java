package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: umeticket-shopping-topology
 * @description:增值服务
 * @author: hzgao
 * @create: 2020-07-21 11:16
 **/
@Data
public class AddedPriority implements Serializable {
    /**
     * 权益名称-详情页展示的描述信息-产品可任意配置
     *
     * @mock 退改签手续费优惠（需要简单明了）
     */
    private String info;
    /**
     * 权益详情-点击详情进去看到的数据信息，按照短描述长描述一个一个放
     *
     * @mock list0-退改签手续费优惠，list1-退改签手续费优惠长描述A舱50%Y舱100%等等
     */
    private List<String> desc;

}
