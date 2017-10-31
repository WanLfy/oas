package com.zzu.oas.service;

import com.zzu.oas.bean.ExaConfig;
import com.zzu.oas.util.ExaPaper;

/**
 * Created by qinhao on 2017/10/31.
 */
public interface ExaService {

    // 生成试卷
    public ExaPaper initExPaper(int tempId);

    // 读取试卷配置
    public ExaConfig getExaConfig();

    // 通过面试类型随机产生模板id
    public int getTempIdByLibType(String libType);

    // 随机生成temp
    public void makeTemp();
}
