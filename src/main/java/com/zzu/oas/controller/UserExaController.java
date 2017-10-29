package com.zzu.oas.controller;

import com.zzu.oas.bean.UserScore;
import com.zzu.oas.repository.UserScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinhao on 2017/10/27 12:08.
 */
@RestController
public class UserExaController {

    @Autowired
    UserScoreRepository userScoreRepository;

    @RequestMapping("/test")
    public String allTest() {
        UserScore userScore = userScoreRepository.findUserScoreByUserFlag("test");
        System.out.println("userFlag:" + userScore.getUserFlag()
                + ",name:" + userScore.getName()
                + ",major:" + userScore.getMajor()
                + ",school:" + userScore.getSchool()
                + ",post:" + userScore.getPost());
        return "success";
    }
}
