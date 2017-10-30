package com.zzu.oas.util;

import com.zzu.oas.bean.QueBank;

import java.util.List;

/**
 * Created by qinhao on 2017/10/30.
 */
public class ExaPaper {

    // 选择题
    private List<MergeQueOptions> choiceList;
    // 判断题
    private List<QueBank> judgeList;
    // 简答题
    private List<QueBank> shortList;

    public List<MergeQueOptions> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<MergeQueOptions> choiceList) {
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
}
