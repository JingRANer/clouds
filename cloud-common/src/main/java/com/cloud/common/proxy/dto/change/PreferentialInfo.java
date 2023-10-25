package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

@Data
public class PreferentialInfo implements Serializable {
    /**
     * 优惠描述
     *
     * @mock 下单减￥20
     */
    private String desc;
    /**
     * 优惠描述配色
     *
     * @mock F74F51
     */
    private String descColor;
    /**
     * 优惠描述背景配色
     *
     * @mock FEEDED
     */
    private String descBackColor;
    /**
     * 优惠图标
     *
     * @mock http://img.umetrip.com/fs/shopping/static/97,08d45dea428c5105
     */
    private String icon;
    /**
     * 优惠类型
     *
     * @mock 会员专享
     */
    private String type;
    /**
     * 优惠类型配色
     *
     * @mock F74F51
     */
    private String typeColor;
    /**
     * 优惠类型背景配色
     *
     * @mock FEEDED
     */
    private String typeBackColor;
}
