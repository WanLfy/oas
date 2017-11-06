package com.zzu.oas.common;

import com.zzu.oas.bean.UserExa;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
public class ChoicesAnswer extends UserExa {

    private List<String> answerList;

    public List<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "ChoicesAnswer{" +
                "answerList=" + answerList +
                '}';
    }
}
