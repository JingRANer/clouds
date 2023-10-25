package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/10 14:10
 * @description:托运行李
 */
@Data
public class BaggagePriority implements Serializable {
    private static final long serialVersionUID = 1932633650027572590L;
    /**
     * 件数-后台做文字拼接
     *
     * @mock 1
     */
    private String pieces;
    /**
     * 免费额度-免费重量单位KG，后台做文字拼接
     *
     * @mock 20
     */
    private String weight;
    /**
     * 文字描述
     *
     * @mock 免费托运行李额为25KG/无免费托运行李
     */
    private String description;
}
