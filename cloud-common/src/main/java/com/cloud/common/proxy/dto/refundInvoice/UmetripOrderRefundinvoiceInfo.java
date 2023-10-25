package com.cloud.common.proxy.dto.refundInvoice;

public class UmetripOrderRefundinvoiceInfo {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 业务名称
     */
    private String name;

    /**
     * 发票类型
     */
    private String invoicetype;

    /**
     * 抬头类型
     */
    private String head;

    /**
     * 公司名称(发票抬头)
     */
    private String company;

    /**
     * 公司税号
     */
    private String taxno;

    /**
     * 发票总金额
     */
    private String refundfee;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 联系人
     */
    private String person;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 提交时间
     */
    private String subtime;

    /**
     * 退款单号
     */
    private String refundorder;

    /**
     * 航旅订单号
     */
    private String orderno;

    /**
     * 美程订单号
     */
    private String orderitemid;

    /**
     * 渠道号
     */
    private String source;

    /**
     * 发送按钮
     */
    private Integer hassend;

    /**
     * 航旅退款单号
     */
    private String umetriprefundid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 退票发票id
     */
    private String refundinvoiceid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    public String getRefundfee() {
        return refundfee;
    }

    public void setRefundfee(String refundfee) {
        this.refundfee = refundfee;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSubtime() {
        return subtime;
    }

    public void setSubtime(String subtime) {
        this.subtime = subtime;
    }

    public String getRefundorder() {
        return refundorder;
    }

    public void setRefundorder(String refundorder) {
        this.refundorder = refundorder;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(String orderitemid) {
        this.orderitemid = orderitemid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getHassend() {
        return hassend;
    }

    public void setHassend(Integer hassend) {
        this.hassend = hassend;
    }

    public String getUmetriprefundid() {
        return umetriprefundid;
    }

    public void setUmetriprefundid(String umetriprefundid) {
        this.umetriprefundid = umetriprefundid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRefundinvoiceid() {
        return refundinvoiceid;
    }

    public void setRefundinvoiceid(String refundinvoiceid) {
        this.refundinvoiceid = refundinvoiceid;
    }
}