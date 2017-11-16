package com.zzu.oas.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzu.oas.common.InputQue;
import com.zzu.oas.service.InputQueService;
import com.zzu.oas.service.impl.InputQueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by qinhao on 2017/11/8.
 */
@Controller
public class InputQueController {

    @Autowired
    private InputQueService inputQueService;
    // 暂时保存题目
    protected static List<InputQue> inputQueList = new ArrayList<>();

    //    // 保存题目到list中
//    @RequestMapping(value = "/inputQue", method = RequestMethod.POST)
//    public String inputQue(@ModelAttribute("iq") InputQue inputQue) {
//        if (inputQue != null) {
//            inputQueList.add(inputQue);
//        }
//        return "admin";
//    }
// 保存题目到list中
    @RequestMapping(value = "/inputQue", method = RequestMethod.POST)
    public String inputQue(@RequestParam("json") String json) {
        if (json != null && json != "") {
            JSONObject jsonObject = JSONObject.parseObject(json);
            InputQue inputQue = new InputQue();
            List<String> answerList = new ArrayList<>();
            List<String> optionsList = new ArrayList<>();
            Set<String> keys = jsonObject.keySet();
            for (String key : keys) {
                if (key.indexOf("answer") != -1) {
                    answerList.add(jsonObject.getString(key));
                }
                if (key.indexOf("options") != -1) {
                    optionsList.add(jsonObject.getString(key));
                }
            }
            inputQue.setPost(jsonObject.getString("post"));
            inputQue.setTitle(jsonObject.getString("title"));
            inputQue.setType(jsonObject.getInteger("type"));
            inputQue.setDes(jsonObject.getString("des"));
            inputQue.setAnswerList(answerList);
            inputQue.setOptionsList(optionsList);
            inputQueList.add(inputQue);
        }

        return "admin";
    }

    // 提交入库
    @RequestMapping(value = "/commitInputQues", method = RequestMethod.GET)
    public String commitInputQueList(Model model) {
        try {
            inputQueService.commitInputQueList(inputQueList);
            inputQueList.clear();
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("commiterror", e.getMessage());
        }
        return "admin";
    }

    @ResponseBody
    @RequestMapping(value = "/showInputQues", method = RequestMethod.POST)
    public List<InputQue> showInputQues() {
        return inputQueList;
    }

}
