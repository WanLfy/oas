package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.repository.UserInfoRepository;
import com.zzu.oas.service.QueryUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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


    public Page<UserInfo> getAllUsers(int pageNumber, int pageSize, Sort sort) {

        PageRequest pageRequest = this.buildPageRequest(pageNumber, pageSize, sort);
        Page<UserInfo> userInfoList = userInfoRepository.findAll(pageRequest);
        return userInfoList;

    }

    private PageRequest buildPageRequest(int pageNumber, int pagzSize, Sort sort) {

        return new PageRequest(pageNumber - 1, pagzSize, sort);
    }

}
