package com.zzu.oas.controller;

import com.zzu.oas.bean.UserScore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("userInfo", new UserScore());
        return "test";
    }
}
