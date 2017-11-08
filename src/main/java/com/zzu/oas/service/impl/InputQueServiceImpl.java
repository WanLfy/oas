package com.zzu.oas.service.impl;

import com.zzu.oas.common.InputQue;
import com.zzu.oas.common.OAS;
import com.zzu.oas.repository.ExaTemplateRepository;
import com.zzu.oas.repository.QueAnswerRepository;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import com.zzu.oas.service.InputQueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by qinhao on 2017/11/8.
 */
@Service
public class InputQueServiceImpl implements InputQueService {


    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionsRepository;
    @Autowired
    private QueAnswerRepository queAnswerRepository;
    @Autowired
    private ExaTemplateRepository exaTemplateRepository;

    @Transactional
    @Override
    public void commitInputQueList(List<InputQue> inputQueList) throws Exception {
        Integer tempId = 1;
        if (exaTemplateRepository.getMaxTempId() != null) {
            tempId += exaTemplateRepository.getMaxTempId();
        }
        if (inputQueList != null) {
            for (InputQue iq : inputQueList) {
                Integer queId = 1;
                if (queBankRepository.getMaxQueId() != null) {
                    queId += queBankRepository.getMaxQueId();
                }
                if (iq.getType() == OAS.CHOICE_TYPE || iq.getType() == OAS.CHOICES_TYPE) {
                    // 选择题保存
                    queBankRepository.insertQueBanK(queId, iq.getType(), iq.getPost(), iq.getTitle());
                    // 选项保存
                    for (String options : iq.getOptionsList()) {
                        queOptionsRepository.insertOptions(queId, options);
                    }
                    // 答案保存
                    for (String answer : iq.getAnswerList()) {
                        queAnswerRepository.insertAnswer(queId, answer);
                    }
                } else if (iq.getType() == OAS.JUDGE_TYPE) {
                    // 判断题保存
                    queBankRepository.insertQueBanK(queId, iq.getType(), iq.getPost(), iq.getTitle());
                    for (String answer : iq.getAnswerList()) {
                        queAnswerRepository.insertAnswer(queId, answer);
                    }
                } else {
                    // 简答题保存
                    queBankRepository.insertQueBanK(queId, iq.getType(), iq.getPost(), iq.getTitle());
                    for (String answer : iq.getAnswerList()) {
                        queAnswerRepository.insertAnswer(queId, answer);
                    }
                }
                // 模板加入该体
                exaTemplateRepository.insertTemp(tempId, queId, iq.getPost());
            }
        } else {
            throw new Exception("新加试卷为空");
        }
    }
}
