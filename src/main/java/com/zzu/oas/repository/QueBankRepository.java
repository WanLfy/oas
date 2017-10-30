package com.zzu.oas.repository;

import com.zzu.oas.bean.QueBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueBankRepository extends JpaRepository<QueBank, Integer> {

    // 通过模板获取 type 题目列表
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_bank b WHERE b.type=?1 AND b.que_id IN (SELECT t.que_id FROM t_exa_template t WHERE t.temp_id=?2)")
    public List<QueBank> getQuesByTemplate(int type, int tempId);
}
