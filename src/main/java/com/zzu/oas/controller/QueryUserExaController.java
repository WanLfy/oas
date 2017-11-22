package com.zzu.oas.controller;

import com.zzu.oas.common.ShowExa;
import com.zzu.oas.service.QueryUserExaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qinhao on 2017/11/7.
 */
@Controller
public class QueryUserExaController {

    @Autowired
    private QueryUserExaService queryUserExaService;

    @RequestMapping(value = "/getUserExa")
    public String getUserExa(@RequestParam("userFlag") String userFlag, Model model) {

        ShowExa showExa = new ShowExa();
        try {
            // showExa = queryUserExaService.getShowExa(userFlag);
            showExa = queryUserExaService.getUserExa(userFlag);
            model.addAttribute("se", showExa);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "userInfo";
    }

}
