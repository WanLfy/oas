package com.zzu.oas.controller;

import com.zzu.oas.common.InputQue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinhao on 2017/11/8.
 */
@Controller
public class InputQueController {

    // 暂时保存题目
    protected static List<InputQue> inputQueList = new ArrayList<>();

    @RequestMapping(value = "/inputQue", method = RequestMethod.POST)
    public String inputQue(@ModelAttribute("iq") InputQue inputQue) {
        inputQueList.add(inputQue);
        System.out.println(inputQueList);
        return "";
    }

    @RequestMapping(value = "/jump", method = RequestMethod.GET)
    public String jump() {
        return "/input";
    }

    @ResponseBody
    @RequestMapping(value = "/showInputQues", method = RequestMethod.POST)
    public List<InputQue> showInputQues() {
        return inputQueList;
    }

}
