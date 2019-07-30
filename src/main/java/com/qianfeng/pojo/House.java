package com.qianfeng.pojo;

import java.util.Date;

public class House {
    private Integer hid;

    private Double price;

    private String htype;

    private Double area;

    private String aspect;

    private String floor;

    private String adorn;

    private String plot;

    private String rent;

    private String hdetails;

    private String imgpath;

    private String community;

    private String issure;

    private Date rtime;

    private String region;

    private Integer rid;

    private String pid;

    private String rform;

    private Integer fid;

    private Integer aid;

    private Integer hxid;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype == null ? null : htype.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect == null ? null : aspect.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getAdorn() {
        return adorn;
    }

    public void setAdorn(String adorn) {
        this.adorn = adorn == null ? null : adorn.trim();
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot == null ? null : plot.trim();
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent == null ? null : rent.trim();
    }

    public String getHdetails() {
        return hdetails;
    }

    public void setHdetails(String hdetails) {
        this.hdetails = hdetails == null ? null : hdetails.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getIssure() {
        return issure;
    }

    public void setIssure(String issure) {
        this.issure = issure == null ? null : issure.trim();
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getRform() {
        return rform;
    }

    public void setRform(String rform) {
        this.rform = rform == null ? null : rform.trim();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getHxid() {
        return hxid;
    }

    public void setHxid(Integer hxid) {
        this.hxid = hxid;
    }
}