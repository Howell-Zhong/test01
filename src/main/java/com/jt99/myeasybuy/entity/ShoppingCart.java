package com.jt99.myeasybuy.entity;

//购物车表(esc)
public class ShoppingCart {
    private Integer escId;          //购物车编号，前端不用设置这个属性，数据库自动生成
    private Integer epId;           //商品编号(fk2)
    private Integer euId;           //用户编号(fk1)
    private Integer escQuantity;    //数量
    private Product product;        //商品

    public ShoppingCart() {
    }

    public ShoppingCart(Integer epId, Integer euId, Integer escQuantity) {
        this.escId = escId;
        this.epId = epId;
        this.euId = euId;
        this.escQuantity = escQuantity;
    }

    public ShoppingCart(Integer escId, Integer epId, Integer euId, Integer escQuantity, Product product) {
        this.escId = escId;
        this.epId = epId;
        this.euId = euId;
        this.escQuantity = escQuantity;
        this.product = product;
    }

    public Integer getEscId() {
        return escId;
    }

    public void setEscId(Integer escId) {
        this.escId = escId;
    }

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public Integer getEscQuantity() {
        return escQuantity;
    }

    public void setEscQuantity(Integer escQuantity) {
        this.escQuantity = escQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "escId=" + escId +
                ", epId=" + epId +
                ", euId=" + euId +
                ", escQuantity=" + escQuantity +
                ", product=" + product +
                '}';
    }
}
