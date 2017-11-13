package com.zzu.oas.repository;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    @Query(nativeQuery = true, value = "SELECT * FROM t_user_info ORDER BY do_time DESC ")
    public List<UserInfo> getAll();
}
