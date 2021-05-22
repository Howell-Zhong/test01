package com.jt99.myeasybuy.query;



import com.jt99.myeasybuy.entity.ShippingAddress;
import com.jt99.myeasybuy.entity.User;

import java.util.Date;

/**
 * @ClassName: OrderQuery
 * @Description: 订单query类
 * @Author: 70886
 * @Date: 2021/5/10 15:07
 * @Version 1.0
 **/
public class OrderQuery {


    private Integer eoId;
    private Integer esaId;
    private Integer euId;
    private String euName;
    private Date eoOrderTime;
    private String eoStatus;
    private Double eoCost; // 订单总金额
    private String eoRemarks; // 备注

    private User user; // 用户对象
    private ShippingAddress address; // 地址对象

    private Integer pageNo;
    private Integer pageSize;

    private Integer pageStart;

    public OrderQuery() {
    }

    public OrderQuery(Integer eoId, Integer esaId, Integer euId, String euName, Date eoOrderTime, String eoStatus,
                      Double eoCost, String eoRemarks, User user, ShippingAddress address, Integer pageNo,
                      Integer pageSize, Integer pageStart) {
        this.eoId = eoId;
        this.esaId = esaId;
        this.euId = euId;
        this.euName = euName;
        this.eoOrderTime = eoOrderTime;
        this.eoStatus = eoStatus;
        this.eoCost = eoCost;
        this.eoRemarks = eoRemarks;
        this.user = user;
        this.address = address;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageStart = pageStart;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getEoOrderTime() {
        return eoOrderTime;
    }

    public void setEoOrderTime(Date eoOrderTime) {
        this.eoOrderTime = eoOrderTime;
    }

    public Integer getEoId() {
        return eoId;
    }

    public void setEoId(Integer eoId) {
        this.eoId = eoId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public Integer getEsaId() {
        return esaId;
    }

    public void setEsaId(Integer esaId) {
        this.esaId = esaId;
    }

    public String getEuName() {
        return euName;
    }

    public void setEuName(String euName) {
        this.euName = euName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageStart() {
        return (pageNo-1)*pageSize;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }


}
