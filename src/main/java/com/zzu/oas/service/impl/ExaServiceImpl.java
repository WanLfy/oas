package com.zzu.oas.service.impl;

import com.zzu.oas.bean.ExaConfig;
import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.repository.ExaConfigRepository;
import com.zzu.oas.repository.ExaTempLibRepository;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import com.zzu.oas.service.ExaService;
import com.zzu.oas.util.ExaPaper;
import com.zzu.oas.util.MergeQueOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by qinhao on 2017/10/31.
 */
@Service
public class ExaServiceImpl implements ExaService {

    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionRepository;
    @Autowired
    private ExaTempLibRepository exaTempLibRepository;
    @Autowired
    private ExaConfigRepository exaConfigRepository;

    /**
     * 根据题库类型生成试卷
     *
     * @param tempId 模板类型
     * @return
     */
    @Override
    public ExaPaper initExPaper(int tempId) {
        ExaPaper exaPaper = new ExaPaper();

        if (tempId != 0) {
            // 选择题
            List<QueBank> queBenkList = queBankRepository.getQuesByTemplate(0, tempId);
            List<QueOptions> optionsList = queOptionRepository.getQueOptionsByTemplate(tempId);
            // 随机排序
            Collections.shuffle(optionsList);
            List<MergeQueOptions> choiceList = MergeQueOptions.getMergeQueOptionsList(queBenkList, optionsList);
            // 判断题
            List<QueBank> judgeList = queBankRepository.getQuesByTemplate(1, tempId);
            // 简答题
            List<QueBank> shortList = queBankRepository.getQuesByTemplate(2, tempId);
            // 生成试卷
            exaPaper.setChoiceList(choiceList);
            exaPaper.setJudgeList(judgeList);
            exaPaper.setShortList(shortList);
        }
        return exaPaper;
    }

    @Override
    public ExaConfig getExaConfig() {
        return exaConfigRepository.findOne(1);
    }

    @Override
    public int getTempIdByLibType(String libType) {
        // 获取模板号
        int tempId = exaTempLibRepository.getTempByLibTypeibType(libType);
        return tempId;
    }

    @Override
    public void makeTemp() {
        // 随机生成模板(Java test)
    }
}
