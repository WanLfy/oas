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
}
