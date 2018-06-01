package com.hao.music.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String password;

    private Date registtime;

    private Playrecord playrecord;

    private Integer sex;

    private String nicheng;

    private Date birthday;

    private String address;

    private String img;
    private Integer isvip;
    private Integer tel;
    private Date vipdate;
    private String introduce;

    public Integer getSex() {
        return sex;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Date getVipdate() {
        return vipdate;
    }

    public void setVipdate(Date vipdate) {
        this.vipdate = vipdate;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Playrecord getPlayrecord() {
        return playrecord;
    }

    public void setPlayrecord(Playrecord playrecord) {
        this.playrecord = playrecord;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng == null ? null : nicheng.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}