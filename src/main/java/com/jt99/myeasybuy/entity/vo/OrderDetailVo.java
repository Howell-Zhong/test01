package com.jt99.myeasybuy.entity.vo;



import com.jt99.myeasybuy.entity.Product;

import java.util.List;

/**
 * @ClassName: OrderDetailVo
 * @Description: 订单详情vo类
 * @Author: 70886
 * @Date: 2021/5/11 14:20
 * @Version 1.0
 **/
public class OrderDetailVo {


    private Integer eodId;          //详情编号，前端不用设置这个属性，数据库自动生成
    private Integer epId;           //商品编号(fk1)
    private Integer eoId;           //订单编号(fk2)
    private Short eodQuantity;      //购买数量

    private List<Product> productList;  // 订单详情的商品列表



    public OrderDetailVo() {
    }

    public OrderDetailVo(Integer eodId, Integer epId, Integer eoId, Short eodQuantity, List<Product> productList) {
        this.eodId = eodId;
        this.epId = epId;
        this.eoId = eoId;
        this.eodQuantity = eodQuantity;
        this.productList = productList;
    }

    public Integer getEodId() {
        return eodId;
    }

    public void setEodId(Integer eodId) {
        this.eodId = eodId;
    }

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public Integer getEoId() {
        return eoId;
    }

    public void setEoId(Integer eoId) {
        this.eoId = eoId;
    }

    public Short getEodQuantity() {
        return eodQuantity;
    }

    public void setEodQuantity(Short eodQuantity) {
        this.eodQuantity = eodQuantity;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
