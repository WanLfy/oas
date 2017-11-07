package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.ShowExa;
import com.zzu.oas.service.QueryUserExaService;
import com.zzu.oas.service.QueryUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
@RestController
public class QueryUserInfoController {
    @Autowired
    private QueryUserInfoService queryUserInfoService;
    @Autowired
    private QueryUserExaService queryUserExaService;

    @GetMapping(value = "/getUser")
    public List<UserInfo> getAllUser() {
        return queryUserInfoService.getAllUser();
    }
    

}
