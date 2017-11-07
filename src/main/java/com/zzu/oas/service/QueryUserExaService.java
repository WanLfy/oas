package com.zzu.oas.service;

import com.zzu.oas.common.ShowExa;

/**
 * Created by qinhao on 2017/11/7.
 */
public interface QueryUserExaService {

    // 展示试卷
    public ShowExa getShowExa(String userFlag) throws Exception;
}
