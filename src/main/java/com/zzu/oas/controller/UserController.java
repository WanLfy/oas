package com.zzu.oas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/userInit", method = RequestMethod.GET)
    public String userInit(@RequestParam("libType") String libType, Model model) {

        return "userInfo";
    }
}
