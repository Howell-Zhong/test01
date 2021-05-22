package com.jt99.myeasybuy.entity.vo;

//用户订单详情表
public class OrderShoppingVo {
    //订单详情编号
    private Integer eodId;

    @Override
    public String toString() {
        return "OrderShoppingVo{" +
                "eodId=" + eodId +
                ", epId=" + epId +
                ", euId=" + euId +
                ", eoId=" + eoId +
                ", epName='" + epName + '\'' +
                ", eodQuantity=" + eodQuantity +
                '}';
    }

    //商品编号
    private Integer epId;
    //用户ID
    private Integer euId;
    //订单编号
    private Integer eoId;
    //商品名称
    private String epName;
    //商品数量
    private Integer eodQuantity;
    //商品价格
    private Double epPrice;

    public Double getEpPrice() {
        return epPrice;
    }

    public void setEpPrice(Double epPrice) {
        this.epPrice = epPrice;
    }

    public OrderShoppingVo() {
    }

    public OrderShoppingVo(Integer eodId, Integer epId, Integer euId, Integer eoId, String epName, Integer eodQuantity) {
        this.eodId = eodId;
        this.epId = epId;
        this.euId = euId;
        this.eoId = eoId;
        this.epName = epName;
        this.eodQuantity = eodQuantity;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public OrderShoppingVo(Integer eodId, Integer epId, Integer eoId, String epName, Integer eodQuantity) {
        this.eodId = eodId;
        this.epId = epId;
        this.eoId = eoId;
        this.epName = epName;
        this.eodQuantity = eodQuantity;
    }

    public Integer getEodQuantity() {
        return eodQuantity;
    }


    public void setEodQuantity(Integer eodQuantity) {
        this.eodQuantity = eodQuantity;
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

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }



}
