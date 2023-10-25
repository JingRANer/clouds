package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName : TransferNotice
 * @Description :
 * @Author : jzy
 * @Date: 2021-03-10 15:29
 */
@Data
public class TransferNotice implements Serializable {

    private static final long serialVersionUID = 8260699909304789774L;
    /**
     * 免责描述
     */
    private String disclaimerDesc;
    /**
     * 航司须知详细内容
     */
    private List<TransferNoticeContent> transferNoticeContentList;
}
