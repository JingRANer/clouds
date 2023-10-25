package com.cloud.common.proxy.dto.change.change;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *  AvaliableCabinBean : 查询航班可改签的航班列表的航班舱位bean
 *  每个bean的实体对应一个航班，对应多个舱位
 * @author xuejupo  jpxue@travelsky.com
 *
 * create in 2017-2-6 下午1:51:14
 */

public class AvaliableFlightBean implements Serializable,Comparable<AvaliableFlightBean>{

    @Override
    public String toString() {
        return "AvaliableFlightBean [flight=" + flight + ", cabinList=" + cabinList + "]";
    }

    /** serialVersionUID:  */
    private static final long serialVersionUID = 1L;

    /**
     * flight:  可改签到的航班
     */
    FlightInfo flight = new FlightInfo();

    /**
     * cabinList:  可改签到航班的舱位列表
     */
    List<AvailableFlightCabinBean> cabinList = new ArrayList<AvailableFlightCabinBean>();

    /**
     * 航班最低价
     */
    private Double minPrice;

    /**
     * 航司中文名
     */
    private String airlineName;

    /**
     * 航司图标url
     */
    private String airlineUrl;
    /**
     * 剩余票数
     */
    private String ticketNum;

    /**
     * 航班最低价格描述
     * @mock 起
     * @return
     */
    private String minPriceDesc;

    /**
     * 差价
     * @mock 座位差价 200元
     */
    private String differPrice;

    /**
     * reissueFee: 换开手续费
     */
    private String reissueFee;

    public final FlightInfo getFlight() {
        return flight;
    }

    public final List<AvailableFlightCabinBean> getCabinList() {
        return cabinList;
    }

    public final void setFlight(FlightInfo flight) {
        this.flight = flight;
    }

    public final void setCabinList(List<AvailableFlightCabinBean> cabinList) {
        this.cabinList = cabinList;
    }

    public String getMinPriceDesc() {
        return minPriceDesc;
    }

    public void setMinPriceDesc(String minPriceDesc) {
        this.minPriceDesc = minPriceDesc;
    }


    public String getReissueFee() {
        return reissueFee;
    }

    public void setReissueFee(String reissueFee) {
        this.reissueFee = reissueFee;
    }


    public String getDifferPrice() {
        return differPrice;
    }

    public void setDifferPrice(String differPrice) {
        this.differPrice = differPrice;
    }


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineUrl() {
        return airlineUrl;
    }

    public void setAirlineUrl(String airlineUrl) {
        this.airlineUrl = airlineUrl;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
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
    public int compareTo(AvaliableFlightBean o) {
        return (this.getFlight().getStd()).compareTo(o.getFlight().getStd());
    }
}
