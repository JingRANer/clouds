package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingChannelOrderData.java
 * @Description TODO
 * @createTime 2022年10月26日 16:48:00
 */
@Data
public class ShardingChannelOrderData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long id;

    /**
     * 航旅渠道子订单号
     */
    private String subOrderNo;

    /**
     * 渠道订单号
     */
    private String channelOrderNo;

    /**
     * 预订记录编号（针对美程拼单情况记录pnr）
     */
    private String pnr;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 调用渠道接口成功时间
     */
    private Date doneTime;

    /**
     * 错误码
     */
    private Integer errCode;

    /**
     * 错误原因
     */
    private String errMsg;

    /**
     * 取消订单时间
     */
    private Date cancelTime;

    /**
     * 订单总票价
     */
    private Long totalPrice;

    /**
     * 订单总税额
     */
    private Long totalTax;

    /**
     * 与订单类型有关：
     改期订单时为改期手续费
     退票订单时为退票手续费
     */
    private Long totalCommission;

    /**
     * 订单总交易金额
     * *改期订单时为改期手续费+差价
     *退票订单时为退票手续费

     */
    private Long totalCharge;

    /**
     * 销售渠道
     */
    private String source;

    /**
     * 重试次数
     */
    private Integer retryCount;

    /**
     * 原航旅渠道子订单号
     * 创建退票改期channelOrder时产生
     */
    private String oriSubOrderNo;

    /**
     * 操作人用户ID
     */
    private String userId;
    /**
     * 是否更新操作
     */
    private boolean update;
}
