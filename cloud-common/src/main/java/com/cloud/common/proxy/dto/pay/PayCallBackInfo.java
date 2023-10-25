package com.cloud.common.proxy.dto.pay;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author fhw
 */
public class PayCallBackInfo implements Serializable {

    private static final long serialVersionUID = 9527L;
    private Long id;
    private Long accountId;
    private String state;
    private String orderId;
    private String refundNo;
    private String tenantOrderId;
    private String serialNumber;
    private Float orderAmount;
    private Float payAmount;
    private String productName;
    private String productDesc;
    private String pluginId;
    private String userid;
    private String payId;
    private String payAccount;
    private Date createtime;
    private Date updatetime;
    private String pendingLevel;
    private ArrayList<Adjust> adjustList;
    private Float refundAmount;
    /**
     * 商户实际收款金额
     */
    private Float callbackTotalAmount;

    public PayCallBackInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public String getState() {
        return this.state;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getTenantOrderId() {
        return this.tenantOrderId;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public String getPluginId() {
        return this.pluginId;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getPayId() {
        return this.payId;
    }

    public String getPayAccount() {
        return this.payAccount;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public Date getUpdatetime() {
        return this.updatetime;
    }

    public String getPendingLevel() {
        return this.pendingLevel;
    }

    public ArrayList<Adjust> getAdjustList() {
        return this.adjustList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setTenantOrderId(String tenantOrderId) {
        this.tenantOrderId = tenantOrderId;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setPendingLevel(String pendingLevel) {
        this.pendingLevel = pendingLevel;
    }

    public void setAdjustList(ArrayList<Adjust> adjustList) {
        this.adjustList = adjustList;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public Float getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Float refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Float getCallbackTotalAmount() {
        return callbackTotalAmount;
    }

    public void setCallbackTotalAmount(Float callbackTotalAmount) {
        this.callbackTotalAmount = callbackTotalAmount;
    }
}
