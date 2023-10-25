package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName : TransferNoticeContent
 * @Description : 中转须知内容
 * @Author : jzy
 * @Date: 2020-12-24 13:52
 */
@Data
public class TransferNoticeContent implements Serializable {
    private static final long serialVersionUID = -6469378313266515196L;
    /**
     * 内容标题
     * @mock 中转说明
     */
    private String title;

    /**
     * 内容描述
     */
    private List<String> transferNoticeDesc;
}
