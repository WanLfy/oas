package com.zzu.oas.common;

import java.util.Map;

/**
 * 用户试卷及答案显示
 * Created by qinhao on 2017/11/7.
 */
public class ShowExa extends ExaPaper {

    private Map<Integer, SureAndUser> answers;

    public Map<Integer, SureAndUser> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Integer, SureAndUser> answers) {
        this.answers = answers;
    }
}
