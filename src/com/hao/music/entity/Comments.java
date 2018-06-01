package com.hao.music.entity;


import java.util.Date;

public class Comments {
    private Integer id;

    private User userUpper;//上一级用户

    private String content;

    private User user2;

    private Date time;

    private Song song;

    private Album album;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserUpper() {
        return userUpper;
    }

    public void setUserUpper(User userUpper) {
        this.userUpper = userUpper;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }



    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


}