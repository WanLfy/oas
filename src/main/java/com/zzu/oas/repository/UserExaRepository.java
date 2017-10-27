package com.zzu.oas.repository;

import com.zzu.oas.bean.UserExa;
import com.zzu.oas.bean.pk.UserExaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author qinhao
 * @Date 2017/10/27 11:02
 */
public interface UserExaRepository extends JpaRepository<UserExa, UserExaPK> {

    @Query(value = "select ue from UserExa as ue where ue.userFlag=?1")
    public List<UserExa> findUserExasByUserFlag(String userFlag);
}
