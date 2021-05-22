package com.jt99.myeasybuy.entity;

//订单详情表(eod)
public class OrderDetail {
    private Integer eodId;          //详情编号，前端不用设置这个属性，数据库自动生成
    private Integer epId;           //商品编号(fk1)
    private Integer eoId;           //订单编号(fk2)
    private Integer eodQuantity;      //购买数量

    public OrderDetail() {
    }

    public OrderDetail(Integer epId, Integer eoId, Integer eodQuantity) {
        this.eodId = eodId;
        this.epId = epId;
        this.eoId = eoId;
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

    public Integer getEodQuantity() {
        return eodQuantity;
    }

    public void setEodQuantity(Integer eodQuantity) {
        this.eodQuantity = eodQuantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "eodId=" + eodId +
                ", epId=" + epId +
                ", eoId=" + eoId +
                ", eodQuantity=" + eodQuantity +
                '}';
    }
}
