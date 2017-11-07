package com.zzu.oas.repository;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
    
}
