package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author cuimeiyi
 * @date 2020/7/1 14:04
 */
@Data
public class RefundChangeInfo implements Serializable {
    /**
     * 退票信息
     */
    private List<AppRefundChangeDetail> refundList;
    /**
     * 改签信息
     */
    private List<AppRefundChangeDetail> changeList;
    /**
     * farebasis
     */
    private String farebasis;
    /**
     * 签转
     */
    private String endorsement;
}
