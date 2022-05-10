package com.example.demo.model;

public class Data {
    private String id;
    private String userName;
    private String tryTimes;
    private String startDate;
    private String endDate;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getTryTimes() {
        return tryTimes;
    }
    public void setTryTimes(String tryTimes) {
        this.tryTimes = tryTimes;
    }
    public String getPlayTimes() {
        return startDate;
    }
    public void setPlayTimes(String playTimes) {
        this.startDate = playTimes;
    }
}