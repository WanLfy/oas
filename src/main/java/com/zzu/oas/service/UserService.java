package com.zzu.oas.service;

import com.zzu.oas.util.UserAnswers;
import com.zzu.oas.util.UserInfo;

/**
 * Created by qinhao on 2017/10/31.
 */
public interface UserService {

    // 保存用户信息
    public void save(UserInfo user, int tempId, UserAnswers userAnswers);
}
