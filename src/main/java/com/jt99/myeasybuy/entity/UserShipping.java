package com.jt99.myeasybuy.entity;

//用户收货地址
public class UserShipping {
    private Integer esaId;
    private Integer euId;//用户编号
    private String esaConsignee;//收货人
    private String esaMobile;//手机号
    private String esaProvince;//省份
    private String esaCity;//城市
    private String esaCounty;//区/县
    private String esaDetailedAddress;//详细地址
    private char esaDefault;//是否默认

    public UserShipping() {
    }

    public UserShipping(Integer esaId, Integer euId) {
        this.esaId = esaId;
        this.euId = euId;
    }

    public UserShipping(Integer euId, String esaConsignee, String esaMobile, String esaProvince, String esaCity, String esaCounty, String esaDetailedAddress) {
        this.euId = euId;
        this.esaConsignee = esaConsignee;
        this.esaMobile = esaMobile;
        this.esaProvince = esaProvince;
        this.esaCity = esaCity;
        this.esaCounty = esaCounty;
        this.esaDetailedAddress = esaDetailedAddress;
    }

    public UserShipping(Integer esaId, Integer euId , String esaConsignee, String esaMobile, String esaProvince, String esaCity, String esaCounty, String esaDetailedAddress) {
        this.esaId = esaId;
        this.euId = euId;
        this.esaConsignee = esaConsignee;
        this.esaMobile = esaMobile;
        this.esaProvince = esaProvince;
        this.esaCity = esaCity;
        this.esaCounty = esaCounty;
        this.esaDetailedAddress = esaDetailedAddress;
    }

    public UserShipping(Integer esaId, Integer euId, String esaConsignee, String esaMobile, String esaProvince, String esaCity, String esaCounty, String esaDetailedAddress, char esaDefault) {
        this.esaId = esaId;
        this.euId = euId;
        this.esaConsignee = esaConsignee;
        this.esaMobile = esaMobile;
        this.esaProvince = esaProvince;
        this.esaCity = esaCity;
        this.esaCounty = esaCounty;
        this.esaDetailedAddress = esaDetailedAddress;
        this.esaDefault = esaDefault;
    }

    public Integer getEsaId() {
        return esaId;
    }

    public void setEsaId(Integer esaId) {
        this.esaId = esaId;
    }

    public Integer getEuId() {
        return euId;
    }

    public void setEuId(Integer euId) {
        this.euId = euId;
    }

    public String getEsaConsignee() {
        return esaConsignee;
    }

    public void setEsaConsignee(String esaConsignee) {
        this.esaConsignee = esaConsignee;
    }

    public String getEsaMobile() {
        return esaMobile;
    }

    public void setEsaMobile(String esaMobile) {
        this.esaMobile = esaMobile;
    }

    public String getEsaProvince() {
        return esaProvince;
    }

    public void setEsaProvince(String esaProvince) {
        this.esaProvince = esaProvince;
    }

    public String getEsaCity() {
        return esaCity;
    }

    public void setEsaCity(String esaCity) {
        this.esaCity = esaCity;
    }

    public String getEsaCounty() {
        return esaCounty;
    }

    public void setEsaCounty(String esaCounty) {
        this.esaCounty = esaCounty;
    }

    public String getEsaDetailedAddress() {
        return esaDetailedAddress;
    }

    public void setEsaDetailedAddress(String esaDetailedAddress) {
        this.esaDetailedAddress = esaDetailedAddress;
    }

    public char getEsaDefault() {
        return esaDefault;
    }

    public void setEsaDefault(char esaDefault) {
        this.esaDefault = esaDefault;
    }

    @Override
    public String toString() {
        return "UserShipping{" +
                "esaId=" + esaId +
                ", euId=" + euId +
                ", esaConsignee='" + esaConsignee + '\'' +
                ", esaMobile='" + esaMobile + '\'' +
                ", esaProvince='" + esaProvince + '\'' +
                ", esaCity='" + esaCity + '\'' +
                ", esaCounty='" + esaCounty + '\'' +
                ", esaDetailedAddress='" + esaDetailedAddress + '\'' +
                ", esaDefault=" + esaDefault +
                '}';
    }
}
