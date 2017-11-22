package com.zzu.oas.controller;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.common.ShowExa;
import com.zzu.oas.service.QueryUserExaService;
import com.zzu.oas.service.QueryUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
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

    private static final int USERINFO_PAGESIZE = 8;
    @Autowired
    private QueryUserInfoService queryUserInfoService;

    @GetMapping(value = "/getUser")
    public List<UserInfo> getAllUser() {
        // Page<UserInfo> ppp = queryUserInfoService.getAllUsers(pn, USERINFO_PAGESIZE);
        return queryUserInfoService.getAllUser();
    }

    @GetMapping(value = "/getUsers")
    public Page<UserInfo> getAllUsers(@RequestParam("pn") int pn) {
        Sort sort = new Sort(Sort.Direction.DESC, "doTime");
        Page<UserInfo> userInfoPage = queryUserInfoService.getAllUsers(pn, USERINFO_PAGESIZE, sort);
        return userInfoPage;
    }

}
