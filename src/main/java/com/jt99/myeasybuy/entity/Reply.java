package com.jt99.myeasybuy.entity;

import java.util.Date;

//留言回复表(er)
public class Reply {
    private Integer erId;               //回复编号，前端不用设置这个属性，数据库自动生成
    private Integer ecId;               //留言编号(fk2)
    private Integer euId;               //用户编号(fk1)
    private Date erReplyTime;           //回复时间，前端不用设置这个属性，后端自动生成
    private String erReplyContent;      //回复内容

    public Reply() {
    }

    public Reply(Integer ecId, Integer euId, Date erReplyTime, String erReplyContent) {
        this.erId = erId;
        this.ecId = ecId;
        this.euId = euId;
        this.erReplyTime = erReplyTime;
        this.erReplyContent = erReplyContent;
    }

    public Integer getErId() {
        return erId;
    }

    public void setErId(Integer erId) {
        this.erId = erId;
    }

    public Integer getEcId() {
        return ecId;
    }

    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public Date getErReplyTime() {
        return erReplyTime;
    }

    public void setErReplyTime(Date erReplyTime) {
        this.erReplyTime = erReplyTime;
    }

    public String getErReplyContent() {
        return erReplyContent;
    }

    public void setErReplyContent(String erReplyContent) {
        this.erReplyContent = erReplyContent;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "erId=" + erId +
                ", ecId=" + ecId +
                ", euId=" + euId +
                ", erReplyTime=" + erReplyTime +
                ", erReplyContent='" + erReplyContent + '\'' +
                '}';
    }
}
