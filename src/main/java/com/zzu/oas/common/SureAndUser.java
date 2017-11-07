package com.zzu.oas.common;

import com.zzu.oas.bean.QueAnswer;
import com.zzu.oas.bean.UserExa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 正确答案和用户答案
 * Created by qinhao on 2017/11/7.
 */
public class SureAndUser {

    private List<String> sureAnswer;
    private List<String> userAnswer;


    public static Map<Integer, SureAndUser> getSureAndUserMap(List<Integer> queIds, List<QueAnswer> sureAnswer, List<UserExa> userAnswer) {
        Map<Integer, SureAndUser> answers = new HashMap<>();
        for (int n : queIds) {
            SureAndUser sau = new SureAndUser();
            List<String> sureList = new ArrayList<>();
            List<String> userList = new ArrayList<>();
            for (QueAnswer sa : sureAnswer) {
                if (n == sa.getQueId()) {
                    sureList.add(sa.getAnswer());
                }
            }
            for (UserExa ua : userAnswer) {
                if (n == ua.getQueId()) {
                    userList.add(ua.getUserAnswer());
                }
            }
            sau.setSureAnswer(sureList);
            sau.setUserAnswer(userList);
            answers.put(n, sau);
        }
        return answers;
    }

    public List<String> getSureAnswer() {
        return sureAnswer;
    }

    public void setSureAnswer(List<String> sureAnswer) {
        this.sureAnswer = sureAnswer;
    }

    public List<String> getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(List<String> userAnswer) {
        this.userAnswer = userAnswer;
    }
}
