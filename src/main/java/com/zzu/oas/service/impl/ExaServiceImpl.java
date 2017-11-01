package com.zzu.oas.service.impl;

import com.zzu.oas.bean.ExaConfig;
import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.repository.*;
import com.zzu.oas.service.ExaService;
import com.zzu.oas.util.ExaPaper;
import com.zzu.oas.util.MergeQueOptions;
import com.zzu.oas.util.OAS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    @Autowired
    private ExaTemplateRepository exaTemplateRepository;

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
            List<QueBank> queBenkList = queBankRepository.getQuesByTemplate(OAS.CHOICE_TYPE, tempId);
            List<QueOptions> optionsList = queOptionRepository.getQueOptionsByTemplate(tempId);
            // 随机排序
            Collections.shuffle(optionsList);
            List<MergeQueOptions> choiceList = MergeQueOptions.getMergeQueOptionsList(queBenkList, optionsList);
            // 判断题
            List<QueBank> judgeList = queBankRepository.getQuesByTemplate(OAS.JUDGE_TYPE, tempId);
            // 简答题
            List<QueBank> shortList = queBankRepository.getQuesByTemplate(OAS.SHORT_TYPE, tempId);
            // 生成试卷
            exaPaper.setChoiceList(choiceList);
            exaPaper.setJudgeList(judgeList);
            exaPaper.setShortList(shortList);
        }
        return exaPaper;
    }

    @Override
    public ExaConfig getExaConfig() {
        return exaConfigRepository.findOne(OAS.EXA_CONFIG_ID);
    }

    @Override
    public int getTempIdByLibType(String libType) {
        // 获取模板号
        int tempId = exaTempLibRepository.getTempByLibTypeibType(libType);
        return tempId;
    }

    @Transactional
    @Override
    public void makeTemplate(String libType) {
        // 根据试卷配置随机产生对应类型的题目序号
        ExaConfig exaConfig = exaConfigRepository.findOne(OAS.EXA_CONFIG_ID);
        int cNum = exaConfig.getChoiceNum();
        int jNum = exaConfig.getJudgeNum();
        int sNum = exaConfig.getShortNum();
        // 获取当前最大模板号

        int maxTempId = 1;
        if (exaTemplateRepository.getMaxTempId() != null) {
            maxTempId = exaTemplateRepository.getMaxTempId() + 1;
        }
        // 生成模板(选择、判断、简答)
        batchInserTemp(maxTempId, queBankRepository.getRandQue(libType, OAS.CHOICE_TYPE, cNum));
        batchInserTemp(maxTempId, queBankRepository.getRandQue(libType, OAS.JUDGE_TYPE, jNum));
        batchInserTemp(maxTempId, queBankRepository.getRandQue(libType, OAS.SHORT_TYPE, sNum));
        // 生成模板-题库类型
        exaTempLibRepository.insert(maxTempId, libType);

    }

    public void batchInserTemp(int tempId, List<Integer> queIds) {
        for (Integer queId : queIds) {
            exaTemplateRepository.insertTemp(tempId, queId);
        }
    }

}
