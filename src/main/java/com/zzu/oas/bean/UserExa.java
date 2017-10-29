package com.zzu.oas.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户提交答卷
 * Created by qinhao on 2017/10/27 10:58.
 */
@Entity
@IdClass(UserExa.UserExaPK.class)
@Table(name = "t_user_exa")

public class UserExa {
    @Id
    @Column(length = 10)
    private String userFlag;
    @Id
    private int tempId;
    @Id
    private int queId;
    @Column(length = 100)
    private String userAnswer;

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

    public static class UserExaPK implements Serializable {

        private String userFlag;
        private int tempId;
        private int queId;

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
    }
}
