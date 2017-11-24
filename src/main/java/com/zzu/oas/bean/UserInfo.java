package com.zzu.oas.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by qinhao on 2017/10/27 11:00.
 */
@Entity
@Table(name = "t_user_info")
public class UserInfo {
    @Id
    @Column(length = 10)
    private String userFlag;
    @Column(length = 10, nullable = false)
    private String name;
    private String school;
    private String major;
    private String phone;
    private String email;
    @Column(length = 10, nullable = false)
    private String post;
    private Date doTime;
    private int choiceSumScore;
    private int judgeSumScore;
    private int choicesSumScore;
    private long useTime;

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

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
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

    public int getChoicesSumScore() {
        return choicesSumScore;
    }

    public void setChoicesSumScore(int choicesSumScore) {
        this.choicesSumScore = choicesSumScore;
    }

    public long getUseTime() {
        return useTime;
    }

    public void setUseTime(long useTime) {
        this.useTime = useTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userFlag='" + userFlag + '\'' +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", post='" + post + '\'' +
                ", choiceSumScore=" + choiceSumScore +
                ", judgeSumScore=" + judgeSumScore +
                ", choicesSumScore=" + choicesSumScore +
                '}';
    }
}
