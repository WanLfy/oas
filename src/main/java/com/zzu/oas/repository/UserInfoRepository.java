package com.zzu.oas.repository;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

//    @Modifying
//    @Query(nativeQuery = true, value = "INSERT INTO t_user_score(user_flag,name,school,major,phone,email,post,choice_sum_score,judge_sum_score) " +
//            "VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9)")
//    public void insert(String userFlag, String name, String school, String major, String phone, String email, String post, int css, int jss);
}
