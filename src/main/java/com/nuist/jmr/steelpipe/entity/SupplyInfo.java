package com.nuist.jmr.steelpipe.entity;

import java.util.Date;

public class SupplyInfo {
    private Integer pkId;

    private Integer productTypeId;

    private String productName;

    private Integer supplyNum;

    private String province;

    private String city;

    private Integer supplyFrom;

    private String supplyDesc;

    private Integer isConfirmed;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getSupplyNum() {
        return supplyNum;
    }

    public void setSupplyNum(Integer supplyNum) {
        this.supplyNum = supplyNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getSupplyFrom() {
        return supplyFrom;
    }

    public void setSupplyFrom(Integer supplyFrom) {
        this.supplyFrom = supplyFrom;
    }

    public String getSupplyDesc() {
        return supplyDesc;
    }

    public void setSupplyDesc(String supplyDesc) {
        this.supplyDesc = supplyDesc == null ? null : supplyDesc.trim();
    }

    public Integer getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Integer isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}