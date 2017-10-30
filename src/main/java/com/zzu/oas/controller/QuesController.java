package com.zzu.oas.controller;

import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.repository.QueOptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinhao on 2017/10/30 9:18.
 */
@RestController
public class QuesController {

    @Autowired
    private QueBankRepository queBankRepository;
    @Autowired
    private QueOptionsRepository queOptionsRepository;

    // 获取题目

}
