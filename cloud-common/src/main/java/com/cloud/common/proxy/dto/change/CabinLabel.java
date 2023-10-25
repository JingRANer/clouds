package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

@Data
public class CabinLabel implements Serializable {
    /**
     * 文字描述
     * @mock 经济舱
     */
    private String name;
    /**
     * 价格描述
     * @mock ¥100元起
     */
    private String price;
}
