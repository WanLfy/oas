package com.zzu.oas.controller;

import com.zzu.oas.util.FormBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qinhao on 2017/10/30.
 */
@Controller
public class CommitExaController {

    @RequestMapping(value = "/commit", method = RequestMethod.POST)
    public String commit(@ModelAttribute("formBean") FormBean formBean) {
        System.out.println(formBean.getName());
        System.out.println(formBean.getAge());
        System.out.println(formBean.getStrs().toString());
        System.out.println(formBean.getAnswers().toString());
        return "index";
    }
}
