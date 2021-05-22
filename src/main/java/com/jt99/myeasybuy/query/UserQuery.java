package com.jt99.myeasybuy.query;

public class UserQuery {
    private Integer pageNo; //页码
    private Integer pageSize;   //每页大小
    private Integer startIndex; //分页起始位置

    public UserQuery() {
    }

    public UserQuery(Integer pageNo, Integer pageSize, Integer startIndex) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
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

    @Override
    public String toString() {
        return "UserQuery{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                '}';
    }
}
