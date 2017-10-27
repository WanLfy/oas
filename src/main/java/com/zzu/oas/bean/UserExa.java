package com.zzu.oas.bean;

import com.zzu.oas.bean.pk.UserExaPK;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * 用户提交答卷
 *
 * @Author qinhao
 * @Date 2017/10/27 10:58
 */
@Entity
@IdClass(UserExaPK.class)
@Table(name = "t_user_exa")
public class UserExa {
    @Id
    private String userFlag;
    @Id
    private int tempId;
    @Id
    private int queId;
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
}
