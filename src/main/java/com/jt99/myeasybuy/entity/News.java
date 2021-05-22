package com.jt99.myeasybuy.entity;

import java.util.Date;

//新闻公告表(en)
public class News {
    private Integer enId;           //新闻公告编号，前端不用设置这个属性，数据库自动生成
    private String enTitle;         //标题
    private String enType;          //类型：1新闻，2公告
    private Date enCreateTime;      //时间，前端不用设置这个属性，后端自动生成
    private String enContent;       //内容

    public News() {
    }

    public News(String enTitle, String enType, Date enCreateTime, String enContent) {
        this.enId = enId;
        this.enTitle = enTitle;
        this.enType = enType;
        this.enCreateTime = enCreateTime;
        this.enContent = enContent;
    }

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public String getEnTitle() {
        return enTitle;
    }

    public void setEnTitle(String enTitle) {
        this.enTitle = enTitle;
    }

    public String getEnType() {
        return enType;
    }

    public void setEnType(String enType) {
        this.enType = enType;
    }

    public Date getEnCreateTime() {
        return enCreateTime;
    }

    public void setEnCreateTime(Date enCreateTime) {
        this.enCreateTime = enCreateTime;
    }

    public String getEnContent() {
        return enContent;
    }

    public void setEnContent(String enContent) {
        this.enContent = enContent;
    }

    @Override
    public String toString() {
        return "News{" +
                "enId=" + enId +
                ", enTitle='" + enTitle + '\'' +
                ", enType='" + enType + '\'' +
                ", enCreateTime=" + enCreateTime +
                ", enContent='" + enContent + '\'' +
                '}';
    }
}
