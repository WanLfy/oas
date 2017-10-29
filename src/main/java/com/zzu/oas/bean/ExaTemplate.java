package com.zzu.oas.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 试卷模板
 * Created by qinhao on 2017/10/27 10:50.
 */
@Entity
@Table(name = "t_exa_template")
@IdClass(ExaTemplate.ExaTemplatePK.class)
public class ExaTemplate {
    @Id
    private int tempId;
    @Id
    private int queId;

    public int getTempId() {
        return tempId;
    }

    public void setTempId(int tempId) {
        this.tempId = tempId;
    }

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public static class ExaTemplatePK implements Serializable {
        private int tempId;
        private int queId;

        public int getTempId() {
            return tempId;
        }

        public void setTempId(int tempId) {
            this.tempId = tempId;
        }

        public int getQueId() {
            return queId;
        }

        public void setQueId(int queId) {
            this.queId = queId;
        }
    }
}
