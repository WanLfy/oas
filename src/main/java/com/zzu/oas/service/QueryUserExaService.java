package com.zzu.oas.service;

import com.zzu.oas.common.ShowExa;

/**
 * Created by qinhao on 2017/11/7.
 */
public interface QueryUserExaService {

    // 展示试卷(..)
    public ShowExa getShowExa(String userFlag) throws Exception;

    // 展示用户试卷
    public ShowExa getUserExa(String userFlag) throws Exception;
}
