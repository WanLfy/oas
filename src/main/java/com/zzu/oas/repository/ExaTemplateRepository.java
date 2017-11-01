package com.zzu.oas.repository;

import com.zzu.oas.bean.ExaTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by qinhao on 2017/10/29.
 */
public interface ExaTemplateRepository extends JpaRepository<ExaTemplate, ExaTemplate.ExaTemplatePK> {

    // 获取最大模板号
    @Query(nativeQuery = true, value = "SELECT MAX(temp_id) FROM t_exa_template")
    public Integer getMaxTempId();

    // 插入模板
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_exa_template(temp_id,que_id) VALUES (?1,?2)")
    public void insertTemp(int tempId, int queId);
}
