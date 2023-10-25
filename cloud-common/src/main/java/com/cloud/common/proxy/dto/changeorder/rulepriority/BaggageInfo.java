package com.cloud.common.proxy.dto.changeorder.rulepriority;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 行李信息
 *
 * @author yangsl
 * @date 2022/4/6 11:07
 * @version 1.0
 */
@Data
public class BaggageInfo implements Serializable {
    private static final long serialVersionUID = -5491119863547800199L;
    /**
     * 长
     */
    private String length;
    /**
     * 宽
     */
    private String width;
    /**
     * 高
     */
    private String height;

    /**
     * 重量描述
     */
    private List<String> weightDescList;

    /**
     * 尺寸描述
     */
    private List<String> sizeDescList;
    /**
     * 行李箱图片
     */
    private String bootImgUrl;
    /**
     * 突出描述
     */
    private String extrudeText;

}
