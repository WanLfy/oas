package com.zzu.oas.controller;

import com.zzu.oas.util.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 主页
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class HomeController {

    @Autowired
    private PropertiesConfig config;

    @RequestMapping(value = "/")
    public String home(Model model) {
        // 初始化笔试岗位
        Map<String, String> posts = config.getPosts();
        model.addAttribute("posts", posts);
        return "index";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "login";
    }

    @RequestMapping(value = "/adminIndex", method = RequestMethod.POST)
    public String adminIndex(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (username != null && password != null && "admin".equals(username) && "xianzhao2018".equals(password)) {
            return "admin";
        } else {
            model.addAttribute("msg", "登录失败");
        }
        return "login";
    }
}
