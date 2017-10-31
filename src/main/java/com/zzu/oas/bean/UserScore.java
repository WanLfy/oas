package com.zzu.oas.bean;

import javax.persistence.*;

/**
 * Created by qinhao on 2017/10/27 11:00.
 */
@Entity
@Table(name = "t_user_score")
public class UserScore {
    @Id
    @Column(length = 10)
    private String userFlag;
    @Column(length = 10, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String school;
    @Column(length = 30, nullable = false)
    private String major;
    @Column(length = 11, nullable = false)
    private String phone;
    @Column(length = 30, nullable = false)
    private String email;
    @Column(length = 10, nullable = false)
    private String post;
    @Column(length = 2)
    private int choiceSumScore;
    @Column(length = 2)
    private int judgeSumScore;

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getChoiceSumScore() {
        return choiceSumScore;
    }

    public void setChoiceSumScore(int choiceSumScore) {
        this.choiceSumScore = choiceSumScore;
    }

    public int getJudgeSumScore() {
        return judgeSumScore;
    }

    public void setJudgeSumScore(int judgeSumScore) {
        this.judgeSumScore = judgeSumScore;
    }

    @Override
    public String toString() {
        return "UserScore{" +
                "userFlag='" + userFlag + '\'' +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", post='" + post + '\'' +
                ", choiceSumScore=" + choiceSumScore +
                ", judgeSumScore=" + judgeSumScore +
                '}';
    }
}
