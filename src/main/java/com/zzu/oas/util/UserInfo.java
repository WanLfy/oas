package com.zzu.oas.util;

import com.zzu.oas.bean.UserScore;

/**
 * 用户信息+模板号+题库
 * Created by qinhao on 2017/11/1.
 */
public class UserInfo extends UserScore {
    private String libType;
    private int tempId;

    public String getLibType() {
        return libType;
    }

    public void setLibType(String libType) {
        this.libType = libType;
    }

    public int getTempId() {
        return tempId;
    }

    public void setTempId(int tempId) {
        this.tempId = tempId;
    }
}
