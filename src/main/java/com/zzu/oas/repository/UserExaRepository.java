package com.zzu.oas.repository;

import com.zzu.oas.bean.UserExa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserExaRepository extends JpaRepository<UserExa, Integer> {

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_user_exa(user_flag, temp_id, que_id, user_answer,type) VALUES (?1,?2,?3,?4,?5)")
    public void saveUserExa(String userFlag, int tempId, int queId, String userAnswer, int type);

    // 查询模板号
    @Query(nativeQuery = true, value = "SELECT temp_id FROM t_user_exa WHERE user_flag=?1")
    public Integer getTempIdByUserFlag(String userFlag);

    public List<UserExa> findUserExasByUserFlag(String userFlag);

    // 删除用户试卷
    @Modifying
    @Query(nativeQuery = true, value = "DELETE FROM t_user_exa WHERE user_flag = ?1")
    public void deleteByUserFlag(String userFlag);
}
