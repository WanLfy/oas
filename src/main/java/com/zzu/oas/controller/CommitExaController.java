package com.zzu.oas.controller;

import com.zzu.oas.bean.ExaConfig;
import com.zzu.oas.service.ExaService;
import com.zzu.oas.service.QueService;
import com.zzu.oas.service.UserService;
import com.zzu.oas.util.UserAnswers;
import com.zzu.oas.util.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class CommitExaController {

    @Autowired
    private QueService queService;
    @Autowired
    private ExaService exaService;
    @Autowired
    private UserService userService;

    // 用户试卷提交
    @RequestMapping(value = "/commit", method = RequestMethod.POST)
    public String commit(@ModelAttribute("formBean") UserAnswers userAnswers, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserInfo user = (UserInfo) session.getAttribute("user");
        int tempId = user.getTempId();
        // 分数
        ExaConfig exaConfig = exaService.getExaConfig();
        Map<String, Integer> map = null;
        try {
            map = queService.getRightNum(userAnswers);
        } catch (Exception e) {
            // 用户答案为空
            return "redirect:/exaInit";
        }
        int choiceSumScore = map.get("cNum") * exaConfig.getChoiceScore();
        int judgeSumScore = map.get("jNum") * exaConfig.getJudgeScore();
        user.setChoiceSumScore(choiceSumScore);
        user.setJudgeSumScore(judgeSumScore);
        // 存储用户信息
        userService.save(user, tempId, userAnswers);
        session.invalidate();
        return "index";
    }

}
