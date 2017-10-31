package com.zzu.oas.service;

import com.zzu.oas.bean.UserScore;
import com.zzu.oas.util.UserAnswers;

/**
 * Created by qinhao on 2017/10/31.
 */
public interface UserService {

    // 保存用户信息
    public void save(UserScore user, int tempId, UserAnswers userAnswers);
}
