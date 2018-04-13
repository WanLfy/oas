package com.zzu.oas.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 题目答案
 * Created by qinhao on 2017/10/27 10:52.
 */
@Entity
@Table(name = "t_que_answer")
public class QueAnswer {
    @Id
    @GeneratedValue
    private int id;
    private int queId;
    @Column(columnDefinition = "text")
    private String answer;

    public int getQueId() {
        return queId;
    }

    public void setQueId(int queId) {
        this.queId = queId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QueAnswer{" +
                "id=" + id +
                ", queId=" + queId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
