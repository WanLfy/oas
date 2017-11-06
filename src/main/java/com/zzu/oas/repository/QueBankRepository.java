package com.zzu.oas.repository;

import com.zzu.oas.bean.QueBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueBankRepository extends JpaRepository<QueBank, Integer> {

    // 通过模板号(temp_id)获取某类型(type)的题目列表
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_bank b WHERE b.type=?1 AND b.que_id IN (SELECT t.que_id FROM t_exa_template t WHERE t.temp_id=?2)")
    public List<QueBank> getQues(int type, int tempId);

//    // 随机获取num道libType题库的type类型的题目
//    @Query(nativeQuery = true, value = "SELECT que_id FROM t_que_bank WHERE lib_type=?1 AND type=?2 ORDER BY RAND() LIMIT ?3")
//    public List<Integer> getRandQue(String libType, int type, int num);
}
