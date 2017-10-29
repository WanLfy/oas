package com.zzu.oas.bean;

import groovy.lang.GrabExclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 试卷配置
 * Created by qinhao on 2017/10/27 10:48.
 */
@Entity
@Table(name = "t_exa_config")
public class ExaConfig {
    @Id
    @GrabExclude
    private int id;
    @Column(length = 2)
    private int choiceNum;
    @Column(length = 2)
    private int judgeNum;
    @Column(length = 2)
    private int shortNum;
    @Column(length = 2)
    private int choiceScore;
    @Column(length = 2)
    private int judgeScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "ExaConfig{" +
                "id=" + id +
                ", choiceNum=" + choiceNum +
                ", judgeNum=" + judgeNum +
                ", shortNum=" + shortNum +
                ", choiceScore=" + choiceScore +
                ", judgeScore=" + judgeScore +
                '}';
    }
}
