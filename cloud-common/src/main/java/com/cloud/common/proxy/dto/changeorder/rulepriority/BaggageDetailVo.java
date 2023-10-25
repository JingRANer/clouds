package com.cloud.common.proxy.dto.changeorder.rulepriority;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 行李规定详细信息
 *
 * @author yangsl
 * @date 2022/4/6 11:08
 * @version 1.0
 */
@Data
public class BaggageDetailVo implements Serializable {
    private static final long serialVersionUID = -7219947966014077678L;
    /**
     * 类型
     */
    private String type;
    /**
     * 重量
     */
    private String weight;
    /**
     * 件数
     */
    private String pieces;
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
     * 重量描述类型
     */
    private String weightDescType;

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
    /**
     * 尺寸描述是否展示
     */
    private boolean sizeDescShow;
    /**
     * 自定义描述
     */
    private String customDesc;

}
