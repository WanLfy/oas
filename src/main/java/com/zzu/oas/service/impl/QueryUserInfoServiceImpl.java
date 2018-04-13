package com.zzu.oas.service.impl;

import com.zzu.oas.bean.UserInfo;
import com.zzu.oas.repository.UserInfoRepository;
import com.zzu.oas.service.QueryUserInfoService;
import com.zzu.oas.util.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by qinhao on 2017/11/6.
 */
@Service
public class QueryUserInfoServiceImpl implements QueryUserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private PropertiesConfig config;

    @Override
    public List<UserInfo> getAllUser() {
        List<UserInfo> users = userInfoRepository.getAll();
        Map<String, String> posts = config.getPosts();
        for (UserInfo user : users) {
            if (posts.containsKey(user.getPost())) {
                user.setPost(posts.get(user.getPost()));
            }
        }

        return users;
    }


    public Page<UserInfo> getAllUsers(int pageNumber, int pageSize, Sort sort) {

        PageRequest pageRequest = this.buildPageRequest(pageNumber, pageSize, sort);
        Page<UserInfo> userInfoList = userInfoRepository.findAll(pageRequest);
        return userInfoList;

    }

    @Override
    public Integer queryBishiScore(String userFlag) throws Exception {
        return userInfoRepository.queryBishiScore(userFlag);
    }

    @Override
    public String queryBishiEvaluate(String userFlag) throws Exception {
        return userInfoRepository.queryBishiEvaluate(userFlag);
    }

    private PageRequest buildPageRequest(int pageNumber, int pagzSize, Sort sort) {

        return new PageRequest(pageNumber - 1, pagzSize, sort);
    }

}
