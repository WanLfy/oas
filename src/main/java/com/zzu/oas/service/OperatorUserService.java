package com.zzu.oas.service;

public interface OperatorUserService {

    // 根据用户标识,删除用户信息以及试卷
    public void deleteByUserFlag(String userFlag) throws Exception;
}
