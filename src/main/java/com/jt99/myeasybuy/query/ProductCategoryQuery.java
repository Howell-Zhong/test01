package com.jt99.myeasybuy.query;

import java.util.List;

/**
 * @ClassName: ProductClassQuery
 * @Description: 分类表query类
 * @Author: 70886
 * @Date: 2021/5/8 7:15
 * @Version 1.0
 **/
public class ProductCategoryQuery {
    private Integer epcId; // 分类编号
    private String epcName; // 分类名称
    private Integer epcFatherId; // 父级编号
    private String epcLevel; // 级别

    private List<ProductCategoryQuery> children;

    public List<ProductCategoryQuery> getChildren() {
        return children;
    }

    public void setChildren(List<ProductCategoryQuery> children) {
        this.children = children;
    }

    public ProductCategoryQuery() {
    }

    public ProductCategoryQuery(Integer epcId, String epcName, Integer epcFatherId, String epcLevel) {
        this.epcId = epcId;
        this.epcName = epcName;
        this.epcFatherId = epcFatherId;
        this.epcLevel = epcLevel;
    }

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public String getEpcName() {
        return epcName;
    }

    public void setEpcName(String epcName) {
        this.epcName = epcName;
    }

    public Integer getEpcFatherId() {
        return epcFatherId;
    }

    public void setEpcFatherId(Integer epcFatherId) {
        this.epcFatherId = epcFatherId;
    }

    public String getEpcLevel() {
        return epcLevel;
    }

    public void setEpcLevel(String epcLevel) {
        this.epcLevel = epcLevel;
    }
}
