package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.DoAnswer;
import com.zzu.oas.service.CommitExaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
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
    public String commit(@ModelAttribute("answer") DoAnswer answer, HttpServletRequest request, Model model) {
        try {
            Map<String, Integer> map = commitExaService.checkExaPaper(answer);
            HttpSession session = request.getSession();
            UserInfo user = (UserInfo) session.getAttribute("user");
            Date commitDate = new Date();
            long useTime = (commitDate.getTime() - user.getDoTime().getTime()) / (60 * 1000);
            if (useTime >= 45) {
                user.setUseTime(45);
            } else {
                user.setUseTime(useTime);
            }
            user.setChoiceSumScore(map.get("choiceSumScore"));
            user.setJudgeSumScore(map.get("judgeSumScore"));
            user.setChoicesSumScore(map.get("choicesSumScore"));
            // 存用户信息
            commitExaService.saveUserInfo(user, answer);
            // 删除session中user
            session.removeAttribute("user");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "finished";
    }
}
