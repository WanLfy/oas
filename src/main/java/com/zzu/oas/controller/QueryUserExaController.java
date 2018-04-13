package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.ShowExa;
import com.zzu.oas.service.QueryUserExaService;
import com.zzu.oas.service.QueryUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qinhao on 2017/11/7.
 */
@Controller
public class QueryUserExaController {

    @Autowired
    private QueryUserExaService queryUserExaService;
    @Autowired
    private QueryUserInfoService queryUserInfoService;

    @RequestMapping(value = "/getUserExa")
    public String getUserExa(@RequestParam("userFlag") String userFlag, Model model, HttpServletRequest request) {

        ShowExa showExa = new ShowExa();
        Map<Integer, Integer> choicesRS = new HashMap<Integer, Integer>();
        try {
            // showExa = queryUserExaService.getShowExa(userFlag);
            showExa = queryUserExaService.getUserExa(userFlag);
            model.addAttribute("se", showExa);

            // 用户笔试成绩回显
            UserInfo userInfo = new UserInfo();
            userInfo.setUserFlag(userFlag);
            userInfo.setBishiScore(queryUserInfoService.queryBishiScore(userFlag));
            userInfo.setBishiEvaluate(queryUserInfoService.queryBishiEvaluate(userFlag));
            model.addAttribute("userInfo", userInfo);

            Map<String, ?> messMap = RequestContextUtils.getInputFlashMap(request);
            if (messMap != null) {
                if (messMap.get("successMess") != null)
                    model.addAttribute("successMess", messMap.get("successMess").toString());
                if (messMap.get("errorMess") != null)
                    model.addAttribute("errorMess", messMap.get("errorMess").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "userInfo";
    }

}
