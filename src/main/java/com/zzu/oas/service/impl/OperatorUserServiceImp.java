package com.zzu.oas.service.impl;

import com.zzu.oas.repository.UserExaRepository;
import com.zzu.oas.repository.UserInfoRepository;
import com.zzu.oas.service.OperatorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OperatorUserServiceImp implements OperatorUserService {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Autowired
    private UserExaRepository userExaRepository;

    @Transactional
    @Override
    public void deleteByUserFlag(String userFlag) throws Exception {
        if (userFlag != null && !"".equals(userFlag)) {
            userInfoRepository.deleteByUserInfo(userFlag);
            userExaRepository.deleteByUserFlag(userFlag);
        } else {
            throw new Exception("用户标识不能为空");
        }
    }
}
