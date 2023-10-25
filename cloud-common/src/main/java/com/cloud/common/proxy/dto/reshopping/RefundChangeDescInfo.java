package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

@Data
public class RefundChangeDescInfo implements Serializable {
    private static final long serialVersionUID = -1806152742694152924L;
    /**
     * 退改签短描述
     */
    private String shortDesc;
    /**
     * 退改签短描述颜色
     */
    private String shortDescColor;


    public RefundChangeDescInfo() {
        super();
    }

    public RefundChangeDescInfo(String shortDesc, String shortDescColor) {
        this.shortDesc = shortDesc;
        this.shortDescColor = shortDescColor;
    }

    public static RefundChangeDescInfo newInstance(String shortDesc, String shortDescColor) {
        return new RefundChangeDescInfo(shortDesc, shortDescColor);
    }
}
