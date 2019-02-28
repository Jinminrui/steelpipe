package com.nuist.jmr.steelpipe.entity;

import java.util.Date;

public class Image {
    private Integer pkId;

    private String imgUrl;

    private Integer imgType;

    private String imgLink;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink == null ? null : imgLink.trim();
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