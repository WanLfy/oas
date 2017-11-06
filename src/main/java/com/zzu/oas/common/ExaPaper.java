package com.zzu.oas.common;

import com.zzu.oas.bean.QueBank;

import java.util.List;

/**
 * 试卷
 * Created by qinhao on 2017/10/30.
 */
public class ExaPaper {

    // 选择题
    private List<MergeQue> choiceList;
    // 判断题
    private List<QueBank> judgeList;
    // 简答题
    private List<QueBank> shortList;
    // 多选题
    private List<MergeQue> choicesList;

    public List<MergeQue> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<MergeQue> choiceList) {
        this.choiceList = choiceList;
    }

    public List<QueBank> getJudgeList() {
        return judgeList;
    }

    public void setJudgeList(List<QueBank> judgeList) {
        this.judgeList = judgeList;
    }

    public List<QueBank> getShortList() {
        return shortList;
    }

    public void setShortList(List<QueBank> shortList) {
        this.shortList = shortList;
    }

    public List<MergeQue> getChoicesList() {
        return choicesList;
    }

    public void setChoicesList(List<MergeQue> choicesList) {
        this.choicesList = choicesList;
    }

    @Override
    public String toString() {
        return "ExaPaper{" +
                "choiceList=" + choiceList +
                ", judgeList=" + judgeList +
                ", shortList=" + shortList +
                ", choicesList=" + choicesList +
                '}';
    }
}
