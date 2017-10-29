package com.zzu.oas.repository;

import com.zzu.oas.bean.QueBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueBankRepository extends JpaRepository<QueBank, Integer> {

    // 获取模板中的题目
    
    public List<QueBank> getQuesByTemplate();
}
