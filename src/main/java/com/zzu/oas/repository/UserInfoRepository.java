package com.zzu.oas.repository;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, String> {

    // 查询所有用户信息
//    @Query(nativeQuery = true, value = "SELECT user_flag,name,choice_sum_score,choices_sum_score,DATE_FORMAT(do_time,'%Y-%m-%d %H:%i:%s') AS gb,email,judge_sum_score,major,phone,post,school,use_time FROM t_user_info ORDER BY gb DESC")
    @Query(nativeQuery = true, value = "SELECT * FROM t_user_info ORDER BY do_time DESC")
    public List<UserInfo> getAll();

    // 删除用户信息
    @Modifying
    @Query(nativeQuery = true, value = "DELETE FROM t_user_info WHERE user_flag = ?1")
    public void deleteByUserInfo(String userFlag);
}
