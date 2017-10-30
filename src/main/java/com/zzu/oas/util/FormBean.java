package com.zzu.oas.util;

import com.zzu.oas.bean.QueAnswer;

import java.util.List;

/**
 * Created by qinhao on 2017/10/30.
 */
public class FormBean {
    private String name;
    private int age;
    private List<String> strs;
    private List<QueAnswer> answers;

    public List<QueAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<QueAnswer> answers) {
        this.answers = answers;
    }

    public List<String> getStrs() {
        return strs;
    }

    public void setStrs(List<String> strs) {
        this.strs = strs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
