package com.zzu.oas.repository;

import com.zzu.oas.bean.UserScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserScoreRepository extends JpaRepository<UserScore, String> {

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_user_score(user_flag,name,school,major,phone,email,post,choice_sum_score,judge_sum_score) " +
            "VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9)")
    public void insert(String userFlag, String name, String school, String major, String phone, String email, String post, int css, int jss);
}
