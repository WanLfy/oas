package com.zzu.oas.repository;

import com.zzu.oas.bean.UserExa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserExaRepository extends JpaRepository<UserExa, UserExa.UserExaPK> {
}