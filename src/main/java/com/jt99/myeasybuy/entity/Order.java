package com.jt99.myeasybuy.entity;

import java.util.Date;

//订单表(eo)
public class Order {
    private Integer eoId;           //订单编号，前端不用设置这个属性，数据库自动生成
    private Integer esaId;          //收货地址编号(fk2)   前端传
    private Integer euId;           //用户编号(fk1)     前端传
    private Date eoOrderTime;       //下单时间，前端不用设置这个属性，后端自动生成
    private String eoStatus;        //订单状态：1已发货，2未发货
    private Double eoCost;          //订单总金额
    private String eoRemarks;       //备注

    public Order() {
    }

    public Order(Integer esaId, Integer euId, Date eoOrderTime, String eoStatus, Double eoCost, String eoRemarks) {
        this.eoId = eoId;
        this.esaId = esaId;
        this.euId = euId;
        this.eoOrderTime = eoOrderTime;
        this.eoStatus = eoStatus;
        this.eoCost = eoCost;
        this.eoRemarks = eoRemarks;
    }

    public Integer getEoId() {
        return eoId;
    }

    public void setEoId(Integer eoId) {
        this.eoId = eoId;
    }

    public Integer getEsaId() {
        return esaId;
    }

    public void setEsaId(Integer esaId) {
        this.esaId = esaId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public Date getEoOrderTime() {
        return eoOrderTime;
    }

    public void setEoOrderTime(Date eoOrderTime) {
        this.eoOrderTime = eoOrderTime;
    }

    public String getEoStatus() {
        return eoStatus;
    }

    public void setEoStatus(String eoStatus) {
        this.eoStatus = eoStatus;
    }

    public Double getEoCost() {
        return eoCost;
    }

    public void setEoCost(Double eoCost) {
        this.eoCost = eoCost;
    }

    public String getEoRemarks() {
        return eoRemarks;
    }

    public void setEoRemarks(String eoRemarks) {
        this.eoRemarks = eoRemarks;
    }

    @Override
    public String toString() {
        return "Order{" +
                "eoId=" + eoId +
                ", esaId=" + esaId +
                ", euId=" + euId +
                ", eoOrderTime=" + eoOrderTime +
                ", eoStatus='" + eoStatus + '\'' +
                ", eoCost=" + eoCost +
                ", eoRemarks='" + eoRemarks + '\'' +
                '}';
    }
}
