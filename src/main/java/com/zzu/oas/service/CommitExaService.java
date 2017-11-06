package com.zzu.oas.service;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.DoAnswer;

import java.util.Map;

/**
 * Created by qinhao on 2017/11/6.
 */
public interface CommitExaService {
    // 改试卷
    public Map<String, Integer> checkExaPaper(DoAnswer da) throws Exception;

    // 保存信息(用户信息和用户试卷)
    public void saveUserInfo(UserInfo user, DoAnswer da) throws Exception;
}
