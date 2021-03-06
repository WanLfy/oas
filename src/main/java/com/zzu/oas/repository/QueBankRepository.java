package com.zzu.oas.repository;

import com.zzu.oas.bean.QueBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueBankRepository extends JpaRepository<QueBank, Integer> {

    // 通过模板号(temp_id)获取某类型(type)的题目列表
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_bank b WHERE b.type=?1 AND b.que_id IN (SELECT t.que_id FROM t_exa_template t WHERE t.temp_id=?2)")
    public List<QueBank> getQues(int type, int tempId);

    // 获取用户已做试题
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_bank b WHERE b.type=?1 AND b.que_id IN (SELECT t.que_id FROM t_user_exa t WHERE t.user_flag=?2)")
    public List<QueBank> getUserExaQues(int type, String userFlag);

    // 保存试题
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_que_bank(que_id,type,post,title,des) VALUES (?1,?2,?3,?4,?5)")
    public void insertQueBanK(int queId, int type, String post, String title, String des);

    // 返回最大id
    @Query(nativeQuery = true, value = "SELECT MAX(que_id) FROM t_que_bank")
    public Integer getMaxQueId();
//    // 随机获取num道libType题库的type类型的题目
//    @Query(nativeQuery = true, value = "SELECT que_id FROM t_que_bank WHERE lib_type=?1 AND type=?2 ORDER BY RAND() LIMIT ?3")
//    public List<Integer> getRandQue(String libType, int type, int num);
}
