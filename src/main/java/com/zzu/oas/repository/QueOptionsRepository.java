package com.zzu.oas.repository;

import com.zzu.oas.bean.QueOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueOptionsRepository extends JpaRepository<QueOptions, QueOptions.QueOptionPk> {

    // 通过模板获取选择题选项
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_options o WHERE o.que_id IN (SELECT t.que_id FROM t_exa_template t WHERE t.temp_id=?1)")
    public List<QueOptions> getQueOptionsByTemplate(int tempId);

    //
    @Query(nativeQuery = true, value = "SELECT * FROM t_que_options o WHERE o.que_id IN (SELECT t.que_id FROM t_user_exa t WHERE t.user_flag=?1)")
    public List<QueOptions> getQueOptionsByUserFlag(String userFlag);

    // 插入选项
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_que_options(que_id,options) VALUES (?1,?2)")
    public void insertOptions(int queId, String options);
}
