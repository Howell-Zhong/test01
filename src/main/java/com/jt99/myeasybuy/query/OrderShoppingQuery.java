package com.jt99.myeasybuy.query;

//用户订单详情表
public class OrderShoppingQuery {
    //订单详情编号
    private Integer eodId;
    //商品编号
    private Integer epId;
    //订单编号
    private Integer eoId;
    //商品名称
    private String epName;
    //商品数量
    private Integer escQuantity;

    public OrderShoppingQuery() {
    }

    public OrderShoppingQuery(Integer eodId, Integer epId, Integer eoId, String epName, Integer escQuantity) {
        this.eodId = eodId;
        this.epId = epId;
        this.eoId = eoId;
        this.epName = epName;
        this.escQuantity = escQuantity;
    }

    public OrderShoppingQuery(Integer epId, Integer eoId, String epName, Integer escQuantity) {
        this.epId = epId;
        this.eoId = eoId;
        this.epName = epName;
        this.escQuantity = escQuantity;
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

    public Integer getEscQuantity() {
        return escQuantity;
    }

    public void setEscQuantity(Integer escQuantity) {
        this.escQuantity = escQuantity;
    }
}
