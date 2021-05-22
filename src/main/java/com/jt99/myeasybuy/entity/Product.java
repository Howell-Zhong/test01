package com.jt99.myeasybuy.entity;

//商品表(ep)
public class Product {
    private Integer epId;                   //商品编号，前端不用设置这个属性，数据库自动生成
    private Integer epcId;                  //分类编号(fk)
    private String epName;                  //商品名称
    private String epFileName;              //商品图片
    private Double epPrice;                 //商品价格
    private String epPromotionCategory;     //推广类别：1今日特价，2热卖推荐
    private String epStatus;                //商品状态，：1上架，2下架
    private String epBrand;                 //品牌
    private Integer epStock;                //库存
    private String barcode;                 //条码号
    private String epDescription;           //详情

    public Product() {
    }

    public Product(Integer epcId, String epName, String epFileName, Double epPrice, String epPromotionCategory, String epStatus, String epBrand, Integer epStock, String barcode, String epDescription) {
        this.epId = epId;
        this.epcId = epcId;
        this.epName = epName;
        this.epFileName = epFileName;
        this.epPrice = epPrice;
        this.epPromotionCategory = epPromotionCategory;
        this.epStatus = epStatus;
        this.epBrand = epBrand;
        this.epStock = epStock;
        this.barcode = barcode;
        this.epDescription = epDescription;
    }

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public String getEpFileName() {
        return epFileName;
    }

    public void setEpFileName(String epFileName) {
        this.epFileName = epFileName;
    }

    public Double getEpPrice() {
        return epPrice;
    }

    public void setEpPrice(Double epPrice) {
        this.epPrice = epPrice;
    }

    public String getEpPromotionCategory() {
        return epPromotionCategory;
    }

    public void setEpPromotionCategory(String epPromotionCategory) {
        this.epPromotionCategory = epPromotionCategory;
    }

    public String getEpStatus() {
        return epStatus;
    }

    public void setEpStatus(String epStatus) {
        this.epStatus = epStatus;
    }

    public String getEpBrand() {
        return epBrand;
    }

    public void setEpBrand(String epBrand) {
        this.epBrand = epBrand;
    }

    public Integer getEpStock() {
        return epStock;
    }

    public void setEpStock(Integer epStock) {
        this.epStock = epStock;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEpDescription() {
        return epDescription;
    }

    public void setEpDescription(String epDescription) {
        this.epDescription = epDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "epId=" + epId +
                ", epcId=" + epcId +
                ", epName='" + epName + '\'' +
                ", epFileName='" + epFileName + '\'' +
                ", epPrice=" + epPrice +
                ", epPromotionCategory='" + epPromotionCategory + '\'' +
                ", epStatus='" + epStatus + '\'' +
                ", epBrand='" + epBrand + '\'' +
                ", epStock=" + epStock +
                ", barcode='" + barcode + '\'' +
                ", epDescription='" + epDescription + '\'' +
                '}';
    }
}
