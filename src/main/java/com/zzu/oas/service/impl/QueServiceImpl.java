package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserExa;
import com.zzu.oas.repository.QueAnswerRepository;
import com.zzu.oas.service.QueService;
import com.zzu.oas.util.UserAnswers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qinhao on 2017/10/31.
 */
@Service
public class QueServiceImpl implements QueService {

    @Autowired
    private QueAnswerRepository queAnswerRepository;

    @Override
    public Map<String, Integer> getRightNum(UserAnswers userAnswers) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int cNum = 0;
        int jNum = 0;
        List<UserExa> canswers = userAnswers.getCanswers();
        List<UserExa> janswers = userAnswers.getJanswers();
        cNum = getNum(canswers);
        jNum = getNum(janswers);
        map.put("cNum", cNum);
        map.put("jNum", jNum);
        return map;
    }

    public int getNum(List<UserExa> userExas) {
        int num = 0;
        for (UserExa userExa : userExas) {
            if (queAnswerRepository.comparison(userExa.getQueId(), userExa.getUserAnswer()) > 0) {
                num++;
            }
        }
        return num;
    }
}
