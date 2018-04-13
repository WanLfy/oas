package com.zzu.oas.service;

import com.zzu.oas.bean.UserInfo;

public interface OperatorUserService {

    // 根据用户标识,删除用户信息以及试卷
    public void deleteByUserFlag(String userFlag) throws Exception;

    // 面试评价
    public void evaluate(UserInfo user) throws Exception;

    // 修改面试分数或面试意见
    public void mianshiScore(int val, String userFlag) throws Exception;

    public void mianshiEvaluate(String val, String userFlag) throws Exception;
}
