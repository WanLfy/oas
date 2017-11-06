package com.zzu.oas.common;

import com.zzu.oas.bean.UserExa;

import java.util.List;

/**
 * 用户试卷答案
 * Created by qinhao on 2017/11/6.
 */
public class DoAnswer {
    // 选择题答案
    private List<UserExa> choiceAnswer;
    // 判断题答案
    private List<UserExa> judgeAnswer;
    // 简答题答案
    private List<UserExa> shortAnswer;
    // 多选题答案
    private List<ChoicesAnswer> choicesAnswer;

    public List<UserExa> getChoiceAnswer() {
        return choiceAnswer;
    }

    public void setChoiceAnswer(List<UserExa> choiceAnswer) {
        this.choiceAnswer = choiceAnswer;
    }

    public List<UserExa> getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(List<UserExa> judgeAnswer) {
        this.judgeAnswer = judgeAnswer;
    }

    public List<UserExa> getShortAnswer() {
        return shortAnswer;
    }

    public void setShortAnswer(List<UserExa> shortAnswer) {
        this.shortAnswer = shortAnswer;
    }

    public List<ChoicesAnswer> getChoicesAnswer() {
        return choicesAnswer;
    }

    public void setChoicesAnswer(List<ChoicesAnswer> choicesAnswer) {
        this.choicesAnswer = choicesAnswer;
    }

    @Override
    public String toString() {
        return "DoAnswer{" +
                "choiceAnswer=" + choiceAnswer +
                ", judgeAnswer=" + judgeAnswer +
                ", shortAnswer=" + shortAnswer +
                ", choicesAnswer=" + choicesAnswer +
                '}';
    }
}
