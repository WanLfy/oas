package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.DoAnswer;
import com.zzu.oas.service.CommitExaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by qinhao on 2017/11/6.
 */
@Controller
public class CommitExaController {

    @Autowired
    private CommitExaService commitExaService;

    // 提交试卷
    @RequestMapping(value = "/commitExaPaper")
    public String commit(@ModelAttribute("answer") DoAnswer answer, HttpServletRequest request) {
        try {
            Map<String, Integer> map = commitExaService.checkExaPaper(answer);
            HttpSession session = request.getSession();
            UserInfo user = (UserInfo) session.getAttribute("user");
            user.setChoiceSumScore(map.get("choiceSumScore"));
            user.setJudgeSumScore(map.get("judgeSumScore"));
            user.setChoicesSumScore(map.get("choicesSumScore"));
            // 存用户信息
            commitExaService.saveUserInfo(user, answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "finished";
    }
}
