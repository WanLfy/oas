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
    @Column(length = 20, nullable = false)
    private String post;
    @Column(length = 1, nullable = false)
    private int type;
    @Column(length = 200)
    private String title;
    @Column
    private String des;
    @Column
    private String qurl;

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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

    public String getQurl() {
        return qurl;
    }

    public void setQurl(String qurl) {
        this.qurl = qurl;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "QueBank{" +
                "queId=" + queId +
                ", post='" + post + '\'' +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", qurl='" + qurl + '\'' +
                '}';
    }
}
