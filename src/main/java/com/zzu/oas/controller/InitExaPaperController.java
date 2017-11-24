package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.ExaPaper;
import com.zzu.oas.service.InitExaPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/**
 * Created by qinhao on 2017/11/6.
 */
@Controller
public class InitExaPaperController {

    @Autowired
    private InitExaPaperService initExaPaperService;

    @RequestMapping(value = "/initExaPaper", method = RequestMethod.POST)
    public String exaInit(@ModelAttribute("user") UserInfo user, HttpServletRequest request, Model model) {
        // 面试类型
        String post = user.getPost();
        // 设置用户标识
        String userFlag = UUID.randomUUID().toString().substring(0, 10);
        user.setUserFlag(userFlag);
        user.setDoTime(new Date());
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        // 生成试卷
        try {
            Integer tempId = initExaPaperService.getTempId(post);
            ExaPaper exaPaper = initExaPaperService.getExaPaper(tempId);
            model.addAttribute("tempId", tempId);
            model.addAttribute("ep", exaPaper);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("initerror", e.getMessage());
            return "index";
        }
        return "exapaper";
    }
}
