package com.jt99.myeasybuy.query;

public class CommentQuery {
    private Integer pageNo; //页码
    private Integer pageSize;   //每页大小
    private Integer startIndex; //分页起始位置
    private String euUserName;
    private String euName;
    private String euSex;
    private Integer erId;
    private Integer euId;

    public CommentQuery() {
    }

    public CommentQuery(Integer pageNo, Integer pageSize, Integer startIndex) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
    }

    public CommentQuery(Integer pageNo, Integer pageSize, Integer startIndex, String euUserName, String euName, String euSex) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
        this.euUserName = euUserName;
        this.euName = euName;
        this.euSex = euSex;
    }

    public CommentQuery(Integer pageNo, Integer pageSize, Integer startIndex, String euUserName, String euName, String euSex, Integer erId) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
        this.euUserName = euUserName;
        this.euName = euName;
        this.euSex = euSex;
        this.erId = erId;
    }

    public CommentQuery(Integer pageNo, Integer pageSize, Integer startIndex, String euUserName, String euName, String euSex, Integer erId, Integer euId) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.startIndex = startIndex;
        this.euUserName = euUserName;
        this.euName = euName;
        this.euSex = euSex;
        this.erId = erId;
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

    public String getEuUserName() {
        return euUserName;
    }

    public void setEuUserName(String euUserName) {
        this.euUserName = euUserName;
    }

    public String getEuName() {
        return euName;
    }

    public void setEuName(String euName) {
        this.euName = euName;
    }

    public String getEuSex() {
        return euSex;
    }

    public void setEuSex(String euSex) {
        this.euSex = euSex;
    }

    public Integer getErId() {
        return erId;
    }

    public void setErId(Integer erId) {
        this.erId = erId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    @Override
    public String toString() {
        return "CommentQuery{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                ", euUserName='" + euUserName + '\'' +
                ", euName='" + euName + '\'' +
                ", euSex='" + euSex + '\'' +
                ", erId=" + erId +
                ", euId=" + euId +
                '}';
    }
}
