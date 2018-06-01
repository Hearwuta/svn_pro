package com.hao.music.entity;

public class Relation {
    private Integer id;

    private User user;

    private User userbyId;//关注人的ID

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUserbyId() {
        return userbyId;
    }

    public void setUserbyId(User userbyId) {
        this.userbyId = userbyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}