package com.zzu.oas.controller;

import com.zzu.oas.common.InputQue;
import com.zzu.oas.service.InputQueService;
import com.zzu.oas.service.impl.InputQueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private InputQueService inputQueService;
    // 暂时保存题目
    protected static List<InputQue> inputQueList = new ArrayList<>();

    // 保存题目到list中
    @RequestMapping(value = "/inputQue", method = RequestMethod.POST)
    public String inputQue(@ModelAttribute("iq") InputQue inputQue) {
        if (inputQue != null) {
            inputQueList.add(inputQue);
        }
        return "admin";
    }

    // 提交入库
    @ResponseBody
    @RequestMapping(value = "/commitInputQues", method = RequestMethod.POST)
    public boolean commitInputQueList() {
        boolean result = false;
        try {
            inputQueService.commitInputQueList(inputQueList);
            result = true;
            inputQueList.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/showInputQues", method = RequestMethod.POST)
    public List<InputQue> showInputQues() {
        return inputQueList;
    }

}
