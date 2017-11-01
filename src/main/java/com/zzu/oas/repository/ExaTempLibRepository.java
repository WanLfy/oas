package com.zzu.oas.repository;

import com.zzu.oas.bean.ExaTempLib;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by qinhao on 2017/10/31.
 */
public interface ExaTempLibRepository extends JpaRepository<ExaTempLib, ExaTempLib.ExaTempLibPK> {

    @Query(nativeQuery = true, value = "SELECT temp_id FROM t_temp_lib WHERE lib_type=?1 ORDER BY RAND() LIMIT 1")
    public int getTempByLibTypeibType(String libType);

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO t_temp_lib(temp_id,lib_type) VALUES (?1,?2)")
    public void insert(int tempId, String libType);
}
