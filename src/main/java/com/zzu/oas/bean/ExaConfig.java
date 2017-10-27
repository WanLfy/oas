package com.zzu.oas.bean;

/**
 * 试卷配置
 *
 * @Author qinhao
 * @Date 2017/10/27 10:48
 */
public class ExaConfig {

    private int choiceNum;
    private int judgeNum;
    private int shortNum;
    private int choiceScore;
    private int judgeScore;

    public int getChoiceNum() {
        return choiceNum;
    }

    public void setChoiceNum(int choiceNum) {
        this.choiceNum = choiceNum;
    }

    public int getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(int judgeNum) {
        this.judgeNum = judgeNum;
    }

    public int getShortNum() {
        return shortNum;
    }

    public void setShortNum(int shortNum) {
        this.shortNum = shortNum;
    }

    public int getChoiceScore() {
        return choiceScore;
    }

    public void setChoiceScore(int choiceScore) {
        this.choiceScore = choiceScore;
    }

    public int getJudgeScore() {
        return judgeScore;
    }

    public void setJudgeScore(int judgeScore) {
        this.judgeScore = judgeScore;
    }
}
