package com.zzu.oas.util;

import com.zzu.oas.bean.UserExa;

import java.util.List;

/**
 * 用户答案
 * Created by qinhao on 2017/10/30.
 */
public class UserAnswers {
    // 选择题答案
    private List<UserExa> canswers;
    // 判断题答案
    private List<UserExa> janswers;
    // 简答题答案
    private List<UserExa> sanswers;

    public List<UserExa> getCanswers() {
        return canswers;
    }

    public void setCanswers(List<UserExa> canswers) {
        this.canswers = canswers;
    }

    public List<UserExa> getJanswers() {
        return janswers;
    }

    public void setJanswers(List<UserExa> janswers) {
        this.janswers = janswers;
    }

    public List<UserExa> getSanswers() {
        return sanswers;
    }

    public void setSanswers(List<UserExa> sanswers) {
        this.sanswers = sanswers;
    }

    @Override
    public String toString() {
        return "UserAnswers{" +
                "canswers=" + canswers +
                ", janswers=" + janswers +
                ", sanswers=" + sanswers +
                '}';
    }
}
