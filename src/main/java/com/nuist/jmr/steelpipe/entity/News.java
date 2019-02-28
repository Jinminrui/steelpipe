package com.nuist.jmr.steelpipe.entity;

import java.util.Date;

public class News {
    private Integer pkId;

    private String newsTitle;

    private String newsLink;

    private Integer newsType;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsLink() {
        return newsLink;
    }

    public void setNewsLink(String newsLink) {
        this.newsLink = newsLink == null ? null : newsLink.trim();
    }

    public Integer getNewsType() {
        return newsType;
    }

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
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