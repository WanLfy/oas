package com.zzu.oas.controller;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import com.zzu.oas.util.ExaPaper;
import com.zzu.oas.util.MergeQueOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

/**
 * Created by qinhao on 2017/10/27 12:08.
 */
@Controller
public class MakeExaController {

    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionRepository;

    @RequestMapping("/test")
    public String allTest(Model model) {
        // 选择题
        List<QueBank> queBenkList = queBankRepository.getQuesByTemplate(0, 1);
        List<QueOptions> optionsList = queOptionRepository.getQueOptionsByTemplate(1);
        // 随机排序
        Collections.shuffle(optionsList);
        List<MergeQueOptions> choiceList = MergeQueOptions.getMergeQueOptionsList(queBenkList, optionsList);
        // 判断题
        List<QueBank> judgeList = queBankRepository.getQuesByTemplate(1, 1);
        // 简答题
        List<QueBank> shortList = queBankRepository.getQuesByTemplate(2, 1);
        System.out.println(choiceList.toString());
        // 生成试卷
        ExaPaper exaPaper = new ExaPaper();
        exaPaper.setChoiceList(choiceList);
        exaPaper.setJudgeList(judgeList);
        exaPaper.setShortList(shortList);
        model.addAttribute("exaPaper", exaPaper);
        return "showques";
    }
}
