package com.zzu.oas.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 题目答案
 * Created by qinhao on 2017/10/27 10:52.
 */
@Entity
@Table(name = "t_que_answer")
@IdClass(QueAnswer.QueAnswerPK.class)
public class QueAnswer{
    @Id
    private int queId;
    @Id
    @Column(length = 100)
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

    public static class QueAnswerPK implements Serializable {
        private int queId;
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
    }

    @Override
    public String toString() {
        return "QueAnswer{" +
                "queId=" + queId +
                ", answer='" + answer + '\'' +
                '}';
    }
}
