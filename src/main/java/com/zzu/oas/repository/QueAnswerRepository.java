package com.zzu.oas.repository;

import com.zzu.oas.bean.QueAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by qinhao on 2017/10/29.
 */
public interface QueAnswerRepository extends JpaRepository<QueAnswer, QueAnswer.QueAnswerPK> {

    // 对比答案
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM t_que_answer WHERE que_id=?1 AND answer=?2")
    public int comparison(int queId, String answer);
}
