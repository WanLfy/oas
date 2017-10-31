package com.zzu.oas.controller;

import com.zzu.oas.service.ExaService;
import com.zzu.oas.util.ExaPaper;
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
    public String exaInit(Model model, HttpServletRequest request) {
        // 获取题库类型
        HttpSession session = request.getSession();
        String libType = (String) session.getAttribute("libType");
        // 生成试卷
        int tempId = exaService.getTempIdByLibType(libType);
        session.setAttribute("tempId", tempId);
        ExaPaper exaPaper = exaService.initExPaper(tempId);
        model.addAttribute("exaPaper", exaPaper);
        return "showques";
    }
}
