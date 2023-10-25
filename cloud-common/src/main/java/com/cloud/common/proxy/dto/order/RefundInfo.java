package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2023/9/25
 */
@Data
public class RefundInfo {

    private List<RefundInfoDetail> refundInfoList;

}
