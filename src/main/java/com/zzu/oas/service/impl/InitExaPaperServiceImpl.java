package com.zzu.oas.service.impl;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.common.ExaPaper;
import com.zzu.oas.common.MergeQue;
import com.zzu.oas.common.OAS;
import com.zzu.oas.repository.ExaTemplateRepository;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import com.zzu.oas.service.InitExaPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
@Service
public class InitExaPaperServiceImpl implements InitExaPaperService {

    @Autowired
    private ExaTemplateRepository templateRepository;
    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionsRepository;

    @Override
    public ExaPaper getExaPaper(String post) throws Exception {
        ExaPaper exaPaper = new ExaPaper();
        Integer tempId = templateRepository.findTempIdByPost(post);
        if (tempId == null) {
            throw new Exception("没有对应" + post + "的模板");
        }
        // 选择题
        List<QueBank> choiceQues = queBankRepository.getQues(OAS.CHOICE_TYPE, tempId);
        List<QueOptions> choiceOptions = queOptionsRepository.getQueOptionsByTemplate(tempId);
        List<MergeQue> choiceList = MergeQue.getMergeQueList(choiceQues, choiceOptions);
        // 判断题
        List<QueBank> judgeQues = queBankRepository.getQues(OAS.JUDGE_TYPE, tempId);
        // 简答题
        List<QueBank> shortQues = queBankRepository.getQues(OAS.SHORT_TYPE, tempId);
        // 多选题
        List<QueBank> choicesQues = queBankRepository.getQues(OAS.CHOICES_TYPE, tempId);
        List<QueOptions> choicesOptions = queOptionsRepository.getQueOptionsByTemplate(tempId);
        List<MergeQue> choicesList = MergeQue.getMergeQueList(choicesQues, choicesOptions);
        // 生成试卷
        exaPaper.setChoiceList(choiceList);
        exaPaper.setChoicesList(choicesList);
        exaPaper.setJudgeList(judgeQues);
        exaPaper.setShortList(shortQues);

        return exaPaper;

    }
}
