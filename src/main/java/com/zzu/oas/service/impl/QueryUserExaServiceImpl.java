package com.zzu.oas.service.impl;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.common.MergeQue;
import com.zzu.oas.common.OAS;
import com.zzu.oas.common.ShowExa;
import com.zzu.oas.common.SureAndUser;
import com.zzu.oas.repository.*;
import com.zzu.oas.service.QueryUserExaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by qinhao on 2017/11/7.
 */
@Service
public class QueryUserExaServiceImpl implements QueryUserExaService {

    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionsRepository;
    @Autowired
    private QueAnswerRepository queAnswerRepository;
    @Autowired
    private UserExaRepository userExaRepository;
    @Autowired
    private ExaTemplateRepository exaTemplateRepository;

    @Override
    public ShowExa getShowExa(String userFlag) throws Exception {
        ShowExa showExa = new ShowExa();
        if (userFlag == null) {
            throw new Exception("用户名不能为空");
        }
        Integer tempId = userExaRepository.getTempIdByUserFlag(userFlag);
        if (tempId != null) {
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
            // 答案
            Map<Integer, SureAndUser> answers = SureAndUser.getSureAndUserMap(
                    exaTemplateRepository.getQueIdByTempId(tempId),
                    queAnswerRepository.getSureAnswer(tempId),
                    userExaRepository.findUserExasByUserFlag(userFlag));
            // 生成试卷
            showExa.setChoiceList(choiceList);
            showExa.setChoicesList(choicesList);
            showExa.setJudgeList(judgeQues);
            showExa.setShortList(shortQues);
            showExa.setAnswers(answers);
        } else {
            throw new Exception("查询错误,tempId为null");
        }
        return showExa;
    }

    @Override
    public ShowExa getUserExa(String userFlag) throws Exception {
        ShowExa showExa = new ShowExa();
        if (userFlag == null) {
            throw new Exception("用户名不能为空");
        }
        // 选择题
        List<QueBank> choiceQues = queBankRepository.getUserExaQues(OAS.CHOICE_TYPE, userFlag);
        List<QueOptions> choiceOptions = queOptionsRepository.getQueOptionsByUserFlag(userFlag);
        List<MergeQue> choiceList = MergeQue.getMergeQueList(choiceQues, choiceOptions);
        // 判断题
        List<QueBank> judgeQues = queBankRepository.getUserExaQues(OAS.JUDGE_TYPE, userFlag);
        // 简答题
        List<QueBank> shortQues = queBankRepository.getUserExaQues(OAS.SHORT_TYPE, userFlag);
        // 多选题
        List<QueBank> choicesQues = queBankRepository.getUserExaQues(OAS.CHOICES_TYPE, userFlag);
        List<QueOptions> choicesOptions = queOptionsRepository.getQueOptionsByUserFlag(userFlag);
        List<MergeQue> choicesList = MergeQue.getMergeQueList(choicesQues, choicesOptions);
        // 答案
        Map<Integer, SureAndUser> answers = SureAndUser.getSureAndUserMap(
                exaTemplateRepository.getQueIdByUserFlag(userFlag),
                queAnswerRepository.getSureAnswerByUserFlag(userFlag),
                userExaRepository.findUserExasByUserFlag(userFlag));
        // 生成试卷
        showExa.setChoiceList(choiceList);
        showExa.setChoicesList(choicesList);
        showExa.setJudgeList(judgeQues);
        showExa.setShortList(shortQues);
        showExa.setAnswers(answers);

        return showExa;
    }
}
