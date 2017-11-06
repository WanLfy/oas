package com.zzu.oas.bean;

import javax.persistence.*;

/**
 * 用户提交答卷
 * Created by qinhao on 2017/10/27 10:58.
 */
@Entity
@Table(name = "t_user_exa")

public class UserExa {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 10, nullable = false)
    private String userFlag;
    @Column(nullable = false)
    private int tempId;
    @Column(nullable = false)
    private int queId;
    @Column(nullable = false)
    private int type;
    private String userAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public int getTempId() {
        return tempId;
    }

    public void setTempId(int tempId) {
        this.tempId = tempId;
    }

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
