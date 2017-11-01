package com.zzu.oas.controller;

import com.zzu.oas.service.ExaService;
import com.zzu.oas.util.ExaPaper;
import com.zzu.oas.util.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 试卷初始化
 * Created by qinhao on 2017/10/27 12:08.
 */
@Controller
public class MakeExaController {

    @Autowired
    private ExaService exaService;

    @RequestMapping("/exaInit")
    public String exaInit(HttpServletRequest request, Model model) {
        // 获取题库类型
        HttpSession session = request.getSession();
        UserInfo user = (UserInfo) session.getAttribute("user");
        String libType = user.getLibType();
        if (session.getAttribute("exaPaper") == null) {
            int tempId = exaService.getTempIdByLibType(libType);
            // 生成试卷
            ExaPaper exaPaper = exaService.initExPaper(tempId);
            session.setAttribute("exaPaper", exaPaper);
            // 设置tempId
            user.setTempId(tempId);
            session.setAttribute("user", user);
        }
        return "showques";
    }
}
