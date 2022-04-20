package com.hardwork.utils;

public class User {
    private String userName;
    private String email;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String password;

    public User(String userName,String password,String email){
        this.userName=userName;
        this.password=password;
        this.email=email;
    }
}
