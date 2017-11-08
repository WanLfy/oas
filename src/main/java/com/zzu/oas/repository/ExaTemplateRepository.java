package com.zzu.oas.repository;

import com.zzu.oas.bean.ExaTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by qinhao on 2017/10/29.
 */
public interface ExaTemplateRepository extends JpaRepository<ExaTemplate, ExaTemplate.ExaTemplatePK> {

    // 获取最大模板号
    @Query(nativeQuery = true, value = "SELECT MAX(temp_id) FROM t_exa_template")
    public Integer getMaxTempId();

    // 插入模板
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_exa_template(temp_id,que_id,post) VALUES (?1,?2,?3)")
    public void insertTemp(int tempId, int queId, String post);

    // 随机获取 post 类型的模板号ORDER BY RAND() LIMIT
    @Query(nativeQuery = true, value = "SELECT t.temp_id FROM t_exa_template t WHERE t.post =?1 ORDER BY RAND() LIMIT 1")
    public Integer findTempIdByPost(String post);

    @Query(nativeQuery = true, value = "SELECT t.que_id FROM t_exa_template t WHERE t.temp_id =?1")
    public List<Integer> getQueIdByTempId(Integer tempId);
}
