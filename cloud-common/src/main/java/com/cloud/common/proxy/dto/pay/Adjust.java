package com.cloud.common.proxy.dto.pay;

import java.util.Date;

/**
 * @author lyxbai
 */
public class Adjust {
    private static final long serialVersionUID = 9527L;
    private Long id;
    private String tenantOrderId;
    private String operator;
    private String msg;
    private Date createtime;
    private Integer adjustAmount;
    private Date updatetime;
    private Long accountId;
    private String tradeType;

    public Adjust() {
    }

    public Long getId() {
        return this.id;
    }

    public String getTenantOrderId() {
        return this.tenantOrderId;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getMsg() {
        return this.msg;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public Integer getAdjustAmount() {
        return this.adjustAmount;
    }

    public Date getUpdatetime() {
        return this.updatetime;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTenantOrderId(String tenantOrderId) {
        this.tenantOrderId = tenantOrderId;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setAdjustAmount(Integer adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
