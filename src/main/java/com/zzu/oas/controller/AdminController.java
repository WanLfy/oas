package com.zzu.oas.controller;

import com.zzu.oas.repository.ExaTemplateRepository;
import com.zzu.oas.service.ExaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qinhao on 2017/11/1.
 */
@Controller
public class AdminController {

    @Autowired
    private ExaService exaService;

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public String adminLogin(String username, String password) {
        if (username != null && password != null && username.trim().equals(password.trim())) {
            return "admin";
        }
        return "redirect:/admin";
    }

    @RequestMapping(value = "/makeTemp", method = RequestMethod.POST)
    public String makeTemp(String libType) {
        exaService.makeTemplate(libType);
        return "admin";
    }

}
