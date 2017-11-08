package com.zzu.oas.service;

import com.zzu.oas.common.InputQue;

import java.util.List;

/**
 * Created by qinhao on 2017/11/8.
 */
public interface InputQueService {

    // 保存新试卷
    public void commitInputQueList(List<InputQue> inputQueList) throws Exception;
}
