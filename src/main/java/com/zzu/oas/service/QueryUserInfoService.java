package com.zzu.oas.service;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by qinhao on 2017/11/6.
 */
public interface QueryUserInfoService {

    public List<UserInfo> getAllUser();

    public Page<UserInfo> getAllUsers(int pageNumber, int pageSize, Sort sort);
}
