package com.zzu.oas.bean.pk;

import java.io.Serializable;

/**
 * 用户提交试卷联合主键
 *
 * @Author qinhao
 * @Date 2017/10/27 11:07
 */
public class UserExaPK implements Serializable {
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
