package com.zzu.oas.repository;

import com.zzu.oas.bean.QueAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/29.
 */
public interface QueAnswerRepository extends JpaRepository<QueAnswer, QueAnswer.QueAnswerPK> {

    @Query(nativeQuery = true, value = "SELECT answer FROM t_que_answer WHERE que_id=?1")
    public String findAnswerByQueId(Integer queId);

    // 获取多选题答案
    @Query(nativeQuery = true, value = "SELECT answer FROM t_que_answer WHERE que_id=?1")
    public List<String> findAnswersByQueId(Integer queId);

    // 根据模板获取答案
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_answer o WHERE o.que_id IN (SELECT t.que_id FROM t_exa_template t WHERE t.temp_id=?1);")
    public List<QueAnswer> getSureAnswer(Integer tempId);
}
