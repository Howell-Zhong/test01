package com.jt99.myeasybuy.entity;

//商品分类表(epc)
public class ProductCategory {
    private Integer epcId;          //分类编号，前端不用设置这个属性，数据库自动生成
    private Integer epcFatherId;    //父级编号
    private String epcName;         //分类名称
    private String epcLevel;        //级别：1父级，2子级

    public ProductCategory() {
    }

    public ProductCategory(Integer epcFatherId, String epcName, String epcLevel) {
        this.epcId = epcId;
        this.epcFatherId = epcFatherId;
        this.epcName = epcName;
        this.epcLevel = epcLevel;
    }

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public Integer getEpcFatherId() {
        return epcFatherId;
    }

    public void setEpcFatherId(Integer epcFatherId) {
        this.epcFatherId = epcFatherId;
    }

    public String getEpcName() {
        return epcName;
    }

    public void setEpcName(String epcName) {
        this.epcName = epcName;
    }

    public String getEpcLevel() {
        return epcLevel;
    }

    public void setEpcLevel(String epcLevel) {
        this.epcLevel = epcLevel;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "epcId=" + epcId +
                ", epcFatherId=" + epcFatherId +
                ", epcName='" + epcName + '\'' +
                ", epcLevel='" + epcLevel + '\'' +
                '}';
    }
}
