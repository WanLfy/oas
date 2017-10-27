package com.zzu.oas.controller;

import com.zzu.oas.bean.UserExa;
import com.zzu.oas.repository.UserExaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author qinhao
 * @Date 2017/10/27 12:08
 */
@RestController
public class UserExaController {

    @Autowired
    private UserExaRepository userExaRepository;

    @RequestMapping("/ues/{userFlag}")
    public List<UserExa> getUserExaByQueId(@PathVariable("userFlag") String userFlag) {
        List<UserExa> a = userExaRepository.findUserExasByUserFlag(userFlag);
        return a;
    }
}
