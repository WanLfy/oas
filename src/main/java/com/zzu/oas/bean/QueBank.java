package com.zzu.oas.bean;

import javax.persistence.*;

/**
 * 题目
 * Created by qinhao on 2017/10/27 10:53.
 */
@Entity
@Table(name = "t_que_bank")
public class QueBank {
    @Id
    @GeneratedValue
    private int queId;
    @Column(length = 2, nullable = false)
    private String libType;
    @Column(length = 1, nullable = false)
    private int type;
    @Column(length = 200)
    private String title;

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getLibType() {
        return libType;
    }

    public void setLibType(String libType) {
        this.libType = libType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
