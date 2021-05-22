package com.jt99.myeasybuy.query;



public class UserShippingQuery {
    private Integer pageNo; //页码
    private Integer pageSize;   //每页大小
    private Integer startIndex; //分页起始位置

    private Integer euId;


    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
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
        return (pageNo-1)*pageSize;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

}

