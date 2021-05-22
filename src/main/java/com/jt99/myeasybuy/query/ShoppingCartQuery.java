package com.jt99.myeasybuy.query;

public class ShoppingCartQuery {
    private Integer pageNo; //页码
    private Integer pageSize;   //每页大小
    private Integer startIndex; //分页起始位置
    private Integer euId;       //用户编号

    public ShoppingCartQuery() {
    }

    public ShoppingCartQuery(Integer pageNo, Integer pageSize, Integer startIndex) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
    }

    public ShoppingCartQuery(Integer pageNo, Integer pageSize, Integer startIndex, Integer euId) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
        this.euId = euId;
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

    public Integer getStartIndex() {
        return (this.pageNo - 1) * this.pageSize;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }
}
