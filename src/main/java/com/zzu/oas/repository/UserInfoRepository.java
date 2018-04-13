package com.zzu.oas.repository;

import com.zzu.oas.bean.UserInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, String> {

    // 查询所有用户信息
    @Query(nativeQuery = true, value = "SELECT * FROM t_user_info ORDER BY do_time DESC ")
    public List<UserInfo> getAll();

    // 删除用户信息
    @Modifying
    @Query(nativeQuery = true, value = "DELETE FROM t_user_info WHERE user_flag = ?1")
    public void deleteByUserInfo(String userFlag);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE  t_user_info SET bishi_score=?1 , bishi_evaluate=?2 WHERE user_flag=?3")
    public void update(int bishiScore, String bishiEvaluate, String userFlag);

    @Query(nativeQuery = true, value = "SELECT bishi_score FROM t_user_info WHERE user_flag=?1")
    public Integer queryBishiScore(String userFlag);

    @Query(nativeQuery = true, value = "SELECT bishi_evaluate FROM t_user_info WHERE user_flag=?1")
    public String queryBishiEvaluate(String userFlag);


    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE  t_user_info SET mianshi_score=?1 WHERE user_flag=?2")
    public void updateScore(Integer mianshiScore, String userFlag);


    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "UPDATE  t_user_info SET mianshi_evaluate=?1 WHERE user_flag=?2")
    public void updateEvaluate(String mianshiEvaluate, String userFlag);
}
