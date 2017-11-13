package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.repository.UserInfoRepository;
import com.zzu.oas.service.QueryUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
@Service
public class QueryUserInfoServiceImpl implements QueryUserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> getAllUser() {
        return userInfoRepository.getAll();
    }
}
