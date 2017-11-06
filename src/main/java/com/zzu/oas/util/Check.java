package com.zzu.oas.util;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
public class Check {

    public static float getScore(List<String> sureList, List<String> answerList) {
        int num = 0;
        for (String answer : answerList) {
            if (sureList.contains(answer)) {
                num++;
            } else {
                num = 0;
                break;
            }
        }
        return num >= 3 ? 1 : (float) (num * 0.5);
    }
}
