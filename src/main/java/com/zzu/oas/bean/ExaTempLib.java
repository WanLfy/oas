package com.zzu.oas.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 题库类型-模板
 * Created by qinhao on 2017/10/31.
 */
@Entity
@Table(name = "t_temp_lib")
@IdClass(ExaTempLib.ExaTempLibPK.class)
public class ExaTempLib {
    @Id
    private int tempId;
    @Id
    private String libType;

    public int getTempId() {
        return tempId;
    }

    public void setTempId(int tempId) {
        this.tempId = tempId;
    }

    public String getLibType() {
        return libType;
    }

    public void setLibType(String libType) {
        this.libType = libType;
    }

    public static class ExaTempLibPK implements Serializable {
        private int tempId;
        private String libType;

        public int getTempId() {
            return tempId;
        }

        public void setTempId(int tempId) {
            this.tempId = tempId;
        }

        public String getLibType() {
            return libType;
        }

        public void setLibType(String libType) {
            this.libType = libType;
        }
    }
}
