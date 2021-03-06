package com.connxun.ttdj.entity;

import java.io.Serializable;

/**
 * @Author anna
 * @Date 2017-11-22 13:54
 * @Descprition 首页小菜单：一级服务
 */

public class CategoryMenu implements Serializable {

    private String categoryid;
    private String name;
    private String picurl;
    private String centerpicurl;


    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getCenterpicurl() {
        return centerpicurl;
    }

    public void setCenterpicurl(String centerpicurl) {
        this.centerpicurl = centerpicurl;
    }

    @Override
    public String toString() {
        return name;
    }
}
