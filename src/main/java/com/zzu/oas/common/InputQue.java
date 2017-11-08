package com.zzu.oas.common;

import com.zzu.oas.bean.QueBank;

import java.util.List;

/**
 * 录入题目
 * Created by qinhao on 2017/11/8.
 */
public class InputQue extends QueBank {

    private List<String> optionsList;
    private List<String> answerList;

    public List<String> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<String> optionsList) {
        this.optionsList = optionsList;
    }

    public List<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "InputQue[" + "post：" + super.getPost() +
                "、title：" + super.getTitle() +
                "、type：" + super.getType() +
                "、optionsList：" + optionsList +
                "、answerList：" + answerList + "]";
    }
}
