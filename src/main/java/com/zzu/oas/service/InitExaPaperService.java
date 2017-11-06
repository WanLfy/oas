package com.zzu.oas.service;

import com.zzu.oas.common.ExaPaper;

/**
 * Created by qinhao on 2017/11/6.
 */
public interface InitExaPaperService {

    // 生成试卷
    public ExaPaper getExaPaper(String post) throws Exception;
}
