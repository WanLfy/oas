package com.zzu.oas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
