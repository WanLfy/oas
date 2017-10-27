package com.zzu.oas.bean;

/**
 * 题目选项
 *
 * @Author qinhao
 * @Date 2017/10/27 10:54
 */
public class QueOption extends QueBank {

    private int queId;
    private String option;

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
