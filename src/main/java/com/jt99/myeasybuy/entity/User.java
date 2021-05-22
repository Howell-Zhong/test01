package com.jt99.myeasybuy.entity;

import java.util.Date;

//用户表(eu)
public class User {
    private Integer euId;           //用户编号，前端不用设置这个属性，数据库自动生成
    private String euUserName;      //用户名
    private String euName;          //姓名
    private String euPassword;      //密码
    private String euSex;           //性别：1男，2女
    private Date euBirthday;        //出生日期
    private String euMobile;        //手机号(eu)
    private String euPicture;       //头像
    private String euType;          //类型(eu)：1用户，2管理员
    private String euStatus;        //使用状态：1启用，2禁用

    public User() {
    }

    public User(String euUserName, String euName, String euPassword, String euSex, Date euBirthday, String euMobile, String euPicture, String euType, String euStatus) {
        this.euId = euId;
        this.euUserName = euUserName;
        this.euName = euName;
        this.euPassword = euPassword;
        this.euSex = euSex;
        this.euBirthday = euBirthday;
        this.euMobile = euMobile;
        this.euPicture = euPicture;
        this.euType = euType;
        this.euStatus = euStatus;
    }

    public User(String euUserName, String euName, String euPassword, String euSex, String euMobile, String euPicture, String euType, String euStatus) {
        this.euId = euId;
        this.euUserName = euUserName;
        this.euName = euName;
        this.euPassword = euPassword;
        this.euSex = euSex;
        this.euMobile = euMobile;
        this.euPicture = euPicture;
        this.euType = euType;
        this.euStatus = euStatus;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
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

    public String getEuPassword() {
        return euPassword;
    }

    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword;
    }

    public String getEuSex() {
        return euSex;
    }

    public void setEuSex(String euSex) {
        this.euSex = euSex;
    }

    public Date getEuBirthday() {
        return euBirthday;
    }

    public void setEuBirthday(Date euBirthday) {
        this.euBirthday = euBirthday;
    }

    public String getEuMobile() {
        return euMobile;
    }

    public void setEuMobile(String euMobile) {
        this.euMobile = euMobile;
    }

    public String getEuPicture() {
        return euPicture;
    }

    public void setEuPicture(String euPicture) {
        this.euPicture = euPicture;
    }

    public String getEuType() {
        return euType;
    }

    public void setEuType(String euType) {
        this.euType = euType;
    }

    public String getEuStatus() {
        return euStatus;
    }

    public void setEuStatus(String euStatus) {
        this.euStatus = euStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "euId=" + euId +
                ", euUserName='" + euUserName + '\'' +
                ", euName='" + euName + '\'' +
                ", euPassword='" + euPassword + '\'' +
                ", euSex='" + euSex + '\'' +
                ", euBirthday=" + euBirthday +
                ", euMobile='" + euMobile + '\'' +
                ", euPicture='" + euPicture + '\'' +
                ", euType='" + euType + '\'' +
                ", euStatus='" + euStatus + '\'' +
                '}';
    }
}