package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.service.OperatorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OperatorUserController {

    @Autowired
    private OperatorUserService operatorUserService;

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public boolean deleteUser(@RequestParam("userFlag") String userFlag) {
        try {
            operatorUserService.deleteByUserFlag(userFlag);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping(value = "/evaluate")
    public String evaluate(@ModelAttribute("userInfo") UserInfo user, RedirectAttributes redirectAttributes) {
        try {
            operatorUserService.evaluate(user);
            redirectAttributes.addFlashAttribute("successMess", "笔试试卷打分完成");
        } catch (Exception e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("errorMess", "笔试试卷打分失败");
            return "redirect:getUserExa?userFlag=" + user.getUserFlag();
        }
        return "redirect:getUserExa?userFlag=" + user.getUserFlag();
    }

    @ResponseBody
    @RequestMapping(value = "/mianshievaluate", method = RequestMethod.POST)
    public Map<String, Boolean> mianshiEvaluate(@RequestParam("val") String val, @RequestParam("userFlag") String userFlag) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        try {
            operatorUserService.mianshiEvaluate(val, userFlag);
            map.put("result", true);
            return map;
        } catch (Exception e) {
            map.put("result", false);
            return map;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/mianshiscore", method = RequestMethod.POST)
    public Map<String, Boolean> mianshiScore(@RequestParam("val") Integer val, @RequestParam("userFlag") String userFlag) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        try {
            operatorUserService.mianshiScore(val, userFlag);
            map.put("result", true);
            return map;
        } catch (Exception e) {
            map.put("result", false);
            return map;
        }
    }
}
