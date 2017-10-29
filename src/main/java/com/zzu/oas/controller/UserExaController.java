package com.zzu.oas.controller;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;
import com.zzu.oas.repository.QueAnswerRepository;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by qinhao on 2017/10/27 12:08.
 */
@Controller
public class UserExaController {

    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionRepository;
    @Autowired
    private QueAnswerRepository queAnswerRepository;

    @RequestMapping("/test")
    public String allTest(Model model) {
        List<QueBank> queBanks = queBankRepository.getQuesByTemplate(1);
        System.out.println(queBanks.toString());
        return "showques";
    }
}
