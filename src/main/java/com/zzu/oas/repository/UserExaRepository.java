package com.zzu.oas.repository;

import com.zzu.oas.bean.UserExa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserExaRepository extends JpaRepository<UserExa, UserExa.UserExaPK> {

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_user_exa(user_flag, temp_id, que_id, user_answer) VALUES (?1,?2,?3,?4)")
    public void saveUserExa(String userFlag, int tempId, int queId, String userAnswer);
}
