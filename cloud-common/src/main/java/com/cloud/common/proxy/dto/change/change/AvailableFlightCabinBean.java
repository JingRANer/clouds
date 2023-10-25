package com.cloud.common.proxy.dto.change.change;


import com.umetrip.air.order.service.dto.change.change.priority.Priority;

import java.io.Serializable;


/**
 * AvaliableCabinBean : 查询航班可改签的航班列表的舱位bean 每个bean的实体对应一个舱位
 *
 * @author xuejupo jpxue@travelsky.com
 *         <p>
 *         create in 2017-2-6 下午1:51:14
 */

public class AvailableFlightCabinBean implements Serializable,Comparable<AvailableFlightCabinBean>{


    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = 1L;
    /**
     * cabinCode: 舱位编码
     */
    private String cabinCode = "";
    /**
     * 舱位信息，A代表舱位充足，数字代表舱位剩余数量
     */
    private String cabinNumber = "";

    /**
     * cabinStatus: 舱位等级
     */
    private String cabinStatus = "";
    /**
     * 舱位中文名
     */
    private String cabinName;

    /**
     * penalty: 换开所需费用
     */
    private double penalty = 0;

    /**
     * reissueFee: 换开手续费
     */
    private double reissueFee = 0;

    /**
     * differFare: 差价
     */
    private double differFare = 0;

    private String xmlSolutionType = "";

    private String context;

    /**
     * 票面价
     *
     * @param o
     * @return
     */
    private Double baseFare;

    /**
     * 权益行李信息
     * @return
     */
    private Priority priority;


    /**
     * 中转仓位
     */
    private String transferCabin;

    @Override
    public String toString() {
        return "AvailableFlightCabinBean{" +
                "cabinCode='" + cabinCode + '\'' +
                ", cabinNumber='" + cabinNumber + '\'' +
                ", cabinStatus='" + cabinStatus + '\'' +
                ", penalty=" + penalty +
                ", reissueFee=" + reissueFee +
                ", differFare=" + differFare +
                ", xmlSolutionType='" + xmlSolutionType + '\'' +
                '}';
    }

    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    public final String getCabinCode() {
        return cabinCode;
    }

    public final String getCabinNumber() {
        return cabinNumber;
    }

    public final String getCabinStatus() {
        return cabinStatus;
    }

    public final double getPenalty() {
        return penalty;
    }

    public final double getReissueFee() {
        return reissueFee;
    }

    public final double getDifferFare() {
        return differFare;
    }

    public final void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    public final void setCabinNumber(String cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public final void setCabinStatus(String cabinStatus) {
        this.cabinStatus = cabinStatus;
    }

    public final void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public final void setReissueFee(double reissueFee) {
        this.reissueFee = reissueFee;
    }

    public final void setDifferFare(double differFare) {
        this.differFare = differFare;
    }

    public String getXmlSolutionType() {
        return xmlSolutionType;
    }

    public void setXmlSolutionType(String xmlSolutionType) {
        this.xmlSolutionType = xmlSolutionType;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

/*    @Override
    public int compareTo(AvailableFlightCabinBean o) {
        return (int) (this.getPenalty() - o.getPenalty());
    }*/

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(AvailableFlightCabinBean o) {
        return (int) (this.getPenalty() - o.getPenalty());
    }
}
