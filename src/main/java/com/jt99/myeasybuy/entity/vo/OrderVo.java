package com.jt99.myeasybuy.entity.vo;


import com.jt99.myeasybuy.entity.ShippingAddress;
import com.jt99.myeasybuy.entity.User;

import java.util.Date;

/**
 * @ClassName: OrderVo
 * @Description: orderVo类
 * @Author: 70886
 * @Date: 2021/5/10 22:15
 * @Version 1.0
 **/
public class OrderVo {

    private Integer eoId; // 订单编号
    private Integer esaId; // 收获地址编号
    private Integer euId; // 用户编号
    private Date eoOrderTime;       //下单时间，前端不用设置这个属性，后端自动生成
    private String eoStatus; //订单状态
    private Double eoCost;          //订单总金额
    private String eoRemarks;       //备注


    private User user; // 用户对象
    private ShippingAddress address; // 地址对象

    public OrderVo() {
    }

    public OrderVo(Integer eoId, Integer esaId, Integer euId, Date eoOrderTime, String eoStatus, Double eoCost,
                   String eoRemarks, User user, ShippingAddress address) {
        this.eoId = eoId;
        this.esaId = esaId;
        this.euId = euId;
        this.eoOrderTime = eoOrderTime;
        this.eoStatus = eoStatus;
        this.eoCost = eoCost;
        this.eoRemarks = eoRemarks;
        this.user = user;
        this.address = address;
    }

    public Date getEoOrderTime() {
        return eoOrderTime;
    }

    public void setEoOrderTime(Date eoOrderTime) {
        this.eoOrderTime = eoOrderTime;
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

    public String getEoStatus() {
        return eoStatus;
    }

    public void setEoStatus(String eoStatus) {
        this.eoStatus = eoStatus;
    }

    public ShippingAddress getAddress() {
        return address;
    }

    public void setAddress(ShippingAddress address) {
        this.address = address;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
