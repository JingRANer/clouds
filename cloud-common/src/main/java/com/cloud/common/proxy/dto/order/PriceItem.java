package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class PriceItem implements Serializable {

    private static final long serialVersionUID = -8592248346904445994L;
    /**
     * 条目名字
     * @mock 订单金额
     */
    private String itemName;
    /**
     * 条目价格
     * @mock ￥4300
     */
    private String itemPrice;
    /**
     * 条目数量
     * @mock 1
     */
    private String itemNum;

    public PriceItem(String itemName) {
        this.itemName = itemName;
    }
}
