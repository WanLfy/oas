package com.zzu.oas.bean;

/**
 * @Author qinhao
 * @Date 2017/10/27 11:00
 */
public class UserScore {
    private String userFlag;
    private String name;
    private String school;
    private String major;
    private String phone;
    private String email;
    private String post;
    private int choiceSumScore;
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
}
