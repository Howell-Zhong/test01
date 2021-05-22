package com.jt99.myeasybuy.query;

/**
 * @ClassName: ProductQuery
 * @Description: 商品query类
 * @Author: 70886
 * @Date: 2021/5/7 13:30
 * @Version 1.0
 **/
public class ProductQuery {

    private Integer epId; // 商品编号
    private Integer epcId; // 分类编号
    private String epName; // 商品名称
    private String epFileName; // 商品图片
    private Double epPrice; // 商品价格
    private String epPromotionCategory; // 推广类别
    private String epStatus; // 商品状态
    private Integer epStock; // 库存
    private String epDescription; // 详情

    private Integer epcFatherId; // 父分类

    private Double epPriceLow; // 低价格
    private Double epPriceHigh; // 高价格


    private Integer pageNo; // 当前页码
    private Integer pageSize; // 显示条数

    private Integer pageStart; // 起使条数


    public ProductQuery() {
    }

    public ProductQuery(Integer epId, Integer epcId, String epName, String epFileName, Double epPrice,
                        String epPromotionCategory, String epStatus, Integer epStock, String epDescription,
                        Integer pageNo, Integer pageSize, Integer pageStart) {
        this.epId = epId;
        this.epcId = epcId;
        this.epName = epName;
        this.epFileName = epFileName;
        this.epPrice = epPrice;
        this.epPromotionCategory = epPromotionCategory;
        this.epStatus = epStatus;
        this.epStock = epStock;
        this.epDescription = epDescription;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageStart = pageStart;
    }

    public ProductQuery(Integer epId, Integer epcId, String epName, String epFileName, Double epPrice,
                        String epPromotionCategory, String epStatus, Integer epStock, String epDescription,
                        Integer epcFatherId, Double epPriceLow, Double epPriceHigh, Integer pageNo, Integer pageSize,
                        Integer pageStart) {
        this.epId = epId;
        this.epcId = epcId;
        this.epName = epName;
        this.epFileName = epFileName;
        this.epPrice = epPrice;
        this.epPromotionCategory = epPromotionCategory;
        this.epStatus = epStatus;
        this.epStock = epStock;
        this.epDescription = epDescription;
        this.epcFatherId = epcFatherId;
        this.epPriceLow = epPriceLow;
        this.epPriceHigh = epPriceHigh;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageStart = pageStart;
    }

    public Double getEpPriceLow() {
        return epPriceLow;
    }

    public void setEpPriceLow(Double epPriceLow) {
        this.epPriceLow = epPriceLow;
    }

    public Double getEpPriceHigh() {
        return epPriceHigh;
    }

    public void setEpPriceHigh(Double epPriceHigh) {
        this.epPriceHigh = epPriceHigh;
    }

    public Integer getEpcFatherId() {
        return epcFatherId;
    }

    public void setEpcFatherId(Integer epcFatherId) {
        this.epcFatherId = epcFatherId;
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



    public Integer getEpStock() {
        return epStock;
    }

    public void setEpStock(Integer epStock) {
        this.epStock = epStock;
    }

    public String getEpDescription() {
        return epDescription;
    }

    public void setEpDescription(String epDescription) {
        this.epDescription = epDescription;
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
