package com.jt99.myeasybuy.entity;

import java.util.Date;

//留言表(ec)
public class Comment {
    private Integer ecId;           //留言编号，前端不用设置这个属性，数据库自动生成
    private Integer euId;           //用户编号(fk)
    private String ecTitle;         //留言标题
    private Date ecCreateTime;      //留言时间，前端不用设置这个属性，后端自动生成
    private String ecContent;       //留言内容
    private Reply reply;            //用于连回复表查询
    private User user;              //用于连用户表查询


    public Comment() {
    }

    public Comment(Integer euId, String ecTitle, Date ecCreateTime, String ecContent) {
        this.ecId = ecId;
        this.euId = euId;
        this.ecTitle = ecTitle;
        this.ecCreateTime = ecCreateTime;
        this.ecContent = ecContent;
    }

    public Comment(Integer ecId, Integer euId, String ecTitle, Date ecCreateTime, String ecContent, Reply reply) {
        this.ecId = ecId;
        this.euId = euId;
        this.ecTitle = ecTitle;
        this.ecCreateTime = ecCreateTime;
        this.ecContent = ecContent;
        this.reply = reply;
    }

    public Comment(Integer ecId, Integer euId, String ecTitle, Date ecCreateTime, String ecContent, Reply reply, User user) {
        this.ecId = ecId;
        this.euId = euId;
        this.ecTitle = ecTitle;
        this.ecCreateTime = ecCreateTime;
        this.ecContent = ecContent;
        this.reply = reply;
        this.user = user;
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

    public String getEcTitle() {
        return ecTitle;
    }

    public void setEcTitle(String ecTitle) {
        this.ecTitle = ecTitle;
    }

    public Date getEcCreateTime() {
        return ecCreateTime;
    }

    public void setEcCreateTime(Date ecCreateTime) {
        this.ecCreateTime = ecCreateTime;
    }

    public String getEcContent() {
        return ecContent;
    }

    public void setEcContent(String ecContent) {
        this.ecContent = ecContent;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "ecId=" + ecId +
                ", euId=" + euId +
                ", ecTitle='" + ecTitle + '\'' +
                ", ecCreateTime=" + ecCreateTime +
                ", ecContent='" + ecContent + '\'' +
                ", reply=" + reply +
                ", user=" + user +
                '}';
    }
}
