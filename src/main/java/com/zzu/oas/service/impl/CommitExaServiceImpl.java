package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserExa;
import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.ChoicesAnswer;
import com.zzu.oas.common.DoAnswer;
import com.zzu.oas.common.OAS;
import com.zzu.oas.repository.QueAnswerRepository;
import com.zzu.oas.repository.UserExaRepository;
import com.zzu.oas.repository.UserInfoRepository;
import com.zzu.oas.service.CommitExaService;
import com.zzu.oas.util.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qinhao on 2017/11/6.
 */
@Service
public class CommitExaServiceImpl implements CommitExaService {

    @Autowired
    private QueAnswerRepository queAnswerRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private UserExaRepository userExaRepository;

    @Override
    public Map<String, Integer> checkExaPaper(DoAnswer da) throws Exception {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int choiceSumScore = 0;
        int judgeSumScore = 0;
        float choicesSumScore = 0;

        List<UserExa> choiceAnswer = da.getChoiceAnswer();
        List<UserExa> judgeAnswer = da.getJudgeAnswer();
        List<ChoicesAnswer> choicesAnswer = da.getChoicesAnswer();
        if (choiceAnswer != null && choiceAnswer.size() != 0) {
            choiceSumScore = checkOne(choiceAnswer, OAS.CHOICE_SCORE);
        }
        if (judgeAnswer != null && judgeAnswer.size() != 0) {
            judgeSumScore = checkOne(judgeAnswer, OAS.JUDGE_SCORE);
        }
        if (choicesAnswer != null && choicesAnswer.size() != 0) {
            choicesSumScore = checkMany(choicesAnswer, OAS.CHOICES_SCORE);
        }
        map.put("choiceSumScore", choiceSumScore);
        map.put("judgeSumScore", judgeSumScore);
        map.put("choicesSumScore", (int) choicesSumScore);
        return map;
    }

    @Transactional
    @Override
    public void saveUserInfo(UserInfo user, DoAnswer da) throws Exception {
        // 保存用户信息
        userInfoRepository.save(user);
        // 保存用户试卷
        List<UserExa> choiceAnswer = da.getChoiceAnswer();
        List<UserExa> judgeAnswer = da.getJudgeAnswer();
        List<UserExa> shortAnswer = da.getShortAnswer();
        List<ChoicesAnswer> choicesAnswer = da.getChoicesAnswer();
        if (choiceAnswer != null && choiceAnswer.size() != 0) {
            for (UserExa c : choiceAnswer) {
                userExaRepository.saveUserExa(user.getUserFlag(), c.getTempId(), c.getQueId(), c.getUserAnswer() == null ? c.getUserAnswer() : "", OAS.CHOICE_TYPE);
            }
        }
        if (judgeAnswer != null && judgeAnswer.size() != 0) {
            for (UserExa j : judgeAnswer) {
                userExaRepository.saveUserExa(user.getUserFlag(), j.getTempId(), j.getQueId(), j.getUserAnswer() == null ? j.getUserAnswer() : "", OAS.JUDGE_TYPE);
            }
        }
        if (shortAnswer != null && shortAnswer.size() != 0) {
            for (UserExa s : shortAnswer) {
                userExaRepository.saveUserExa(user.getUserFlag(), s.getTempId(), s.getQueId(), s.getUserAnswer() == null ? s.getUserAnswer() : "", OAS.SHORT_TYPE);
            }
        }
        if (choiceAnswer != null && choiceAnswer.size() != 0) {
            for (ChoicesAnswer c : choicesAnswer) {
                List<String> answerList = c.getAnswerList();
                if (answerList != null) {
                    for (String userAnswer : answerList) {
                        userExaRepository.saveUserExa(user.getUserFlag(), c.getTempId(), c.getQueId(), userAnswer, OAS.CHOICES_TYPE);
                    }
                } else {
                    userExaRepository.saveUserExa(user.getUserFlag(), c.getTempId(), c.getQueId(), null, OAS.CHOICES_TYPE);
                }
            }
        }
    }

    protected int checkOne(List<UserExa> answerList, int score) {
        int num = 0;
        for (UserExa answer : answerList) {
            if (queAnswerRepository.findAnswerByQueId(answer.getQueId()).equals(answer.getUserAnswer()))
                num++;
        }
        return (num * score);
    }

    protected float checkMany(List<ChoicesAnswer> answerList, int score) {
        float num = 0;
        for (ChoicesAnswer answer : answerList) {
            if (answer.getAnswerList() != null && answer.getAnswerList().size() != 0) {
                // 全对满分
                if (answer.getAnswerList().containsAll(queAnswerRepository.findAnswersByQueId(answer.getQueId()))) {
                    num = num + score;
                    continue;
                }
                // 多选零分
                if (answer.getAnswerList().size() > queAnswerRepository.findAnswersByQueId(answer.getQueId()).size()) {
                    continue;
                } else {
                    // 答对部分
                    num = num + Check.getScore(queAnswerRepository.findAnswersByQueId(answer.getQueId()), answer.getAnswerList());
                }
            }
        }
        return num;
    }
}
