package com.zzu.oas.controller;

import com.zzu.oas.service.OperatorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
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
}
