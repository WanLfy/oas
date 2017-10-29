package com.zzu.oas.service;

import com.zzu.oas.bean.QueBank;

import java.util.List;

/**
 * Created by qinhao on 2017/10/29.
 */
public interface QueBankService {
    /**
     * 获取模板中的题目
     *
     * @return
     */
    public List<QueBank> getQuesByTemplate(int tempId);
}
