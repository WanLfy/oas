package com.zzu.oas.service;

import com.zzu.oas.util.UserAnswers;

import java.util.Map;

/**
 * Created by qinhao on 2017/10/31.
 */
public interface QueService {

    public Map<String, Integer> getRightNum(UserAnswers userAnswers) throws Exception;
}

