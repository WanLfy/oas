package com.zzu.oas.controller;

import com.zzu.oas.util.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class UserController {

    // 选择面试类型
    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public String init(@RequestParam("libType") String libType, Model model) {
        // 存题库类型
        model.addAttribute("libType", libType);
        return "userInfo";
    }

    // 用户信息采集
    @RequestMapping(value = "/initUserInfo", method = RequestMethod.POST)
    public String userInfo(@ModelAttribute("user") UserInfo userInfo, HttpServletRequest request) {
        // 设置用户标识
        String userFlag = UUID.randomUUID().toString().substring(0, 10);
        userInfo.setUserFlag(userFlag);
        // 存用户信息(无成绩信息)
        HttpSession session = request.getSession();
        session.removeAttribute("exaPaper");
        session.setAttribute("user", userInfo);
        return "redirect:/exaInit";
    }
}
