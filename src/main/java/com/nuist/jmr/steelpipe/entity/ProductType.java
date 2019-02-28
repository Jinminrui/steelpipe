package com.nuist.jmr.steelpipe.entity;

import java.util.Date;

public class ProductType {
    private Integer pkId;

    private String productTypeName;

    private String productTypeDesc;

    private Date gmtCreated;

    private Date gmtModified;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    public String getProductTypeDesc() {
        return productTypeDesc;
    }

    public void setProductTypeDesc(String productTypeDesc) {
        this.productTypeDesc = productTypeDesc == null ? null : productTypeDesc.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}