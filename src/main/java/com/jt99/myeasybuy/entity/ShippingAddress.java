package com.jt99.myeasybuy.entity;

//收货地址表(esa)
public class ShippingAddress {
    private Integer esaId;              //收货地址编号，前端不用设置这个属性，数据库自动生成
    private Integer euId;               //用户编号(fk)
    private String esaConsignee;        //收货人
    private String esaMobile;           //手机号
    private String esaProvince;         //省份
    private String esaCity;             //市
    private String esaCounty;           //区/县
    private String esaDetailedAddress;  //详细地址
    private String esaDefault;          //是否默认：1默认，2否

    public ShippingAddress() {
    }

    public ShippingAddress(Integer euId, String esaConsignee, String esaMobile, String esaProvince, String esaCity, String esaCounty, String esaDetailedAddress, String esaDefault) {
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

    public String getEsaDefault() {
        return esaDefault;
    }

    public void setEsaDefault(String esaDefault) {
        this.esaDefault = esaDefault;
    }

    public String getEsaDetailedAddress() {
        return esaDetailedAddress;
    }

    public void setEsaDetailedAddress(String esaDetailedAddress) {
        this.esaDetailedAddress = esaDetailedAddress;
    }


}
