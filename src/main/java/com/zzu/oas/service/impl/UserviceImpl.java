package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserExa;
import com.zzu.oas.bean.UserScore;
import com.zzu.oas.repository.UserExaRepository;
import com.zzu.oas.repository.UserScoreRepository;
import com.zzu.oas.service.UserService;
import com.zzu.oas.util.UserAnswers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


/**
 * Created by qinhao on 2017/10/31.
 */
@Transactional
@Service
public class UserviceImpl implements UserService {

    @Autowired
    private UserExaRepository userExaRepository;
    @Autowired
    private UserScoreRepository userScoreRepository;


    @Override
    public void save(UserScore user, int tempId, UserAnswers userAnswers) {
        // 保存用户信息
        userScoreRepository.save(user);
        // 保存用户答案
        for (UserExa u : userAnswers.getCanswers()) {
            userExaRepository.saveUserExa(user.getUserFlag(), tempId, u.getQueId(), u.getUserAnswer());
        }
        for (UserExa u : userAnswers.getJanswers()) {
            userExaRepository.saveUserExa(user.getUserFlag(), tempId, u.getQueId(), u.getUserAnswer());
        }
        for (UserExa u : userAnswers.getSanswers()) {
            userExaRepository.saveUserExa(user.getUserFlag(), tempId, u.getQueId(), u.getUserAnswer());
        }
    }
}
