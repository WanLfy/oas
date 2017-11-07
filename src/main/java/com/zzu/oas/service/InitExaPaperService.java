package com.zzu.oas.service;

import com.zzu.oas.common.ExaPaper;

/**
 * Created by qinhao on 2017/11/6.
 */
public interface InitExaPaperService {

    // 根据模板生成tempId
    public Integer getTempId(String post) throws Exception;

    // 生成试卷
    public ExaPaper getExaPaper(Integer tempId) throws Exception;
}
