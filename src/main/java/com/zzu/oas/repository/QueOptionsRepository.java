package com.zzu.oas.repository;

import com.zzu.oas.bean.QueOptions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by qinhao on 2017/10/28.
 */
public interface QueOptionsRepository extends JpaRepository<QueOptions, QueOptions.QueOptionPk> {

    public List<QueOptions> findQueOptionsByQueId(int queId);
}
