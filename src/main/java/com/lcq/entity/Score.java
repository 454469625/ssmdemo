package com.lcq.entity;

import java.util.Date;

public class Score {
    private Long id;
    private String changeType;
    private Date createTime;
    private Integer score;
    private User user;

    public Score() {
    }

    public Score(Long id, String changeType, Date createTime, Integer score, User user) {
        this.id = id;
        this.changeType = changeType;
        this.createTime = createTime;
        this.score = score;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
