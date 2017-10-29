package com.zzu.oas.repository;

import com.zzu.oas.bean.UserScore;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserScoreRepository extends JpaRepository<UserScore, String> {

    public UserScore findUserScoreByUserFlag(String userFlag);
}
