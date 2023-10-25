package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class PsgAndLinkManInfo implements Serializable {

    private static final long serialVersionUID = 9215334079042580848L;
    /**
     * 联系人姓名
     * @mock 测试
     */
    private String linkManName;

    /**
     * 联系人电话
     * @mock 18712722282
     */
    private String linkManPhone;

    /**
     * 乘机人信息列表
     */
    private List<PsgOrderInfo> psgOrderInfoList;
}

