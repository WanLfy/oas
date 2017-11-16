package com.zzu.oas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 主页
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "login";
    }

    @RequestMapping(value = "/adminIndex", method = RequestMethod.POST)
    public String adminIndex(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (username != null && password != null && "admin".equals(username) && "primetonsge".equals(password)) {
            return "admin";
        } else {
            model.addAttribute("msg", "登录失败");
        }
        return "login";
    }
}
