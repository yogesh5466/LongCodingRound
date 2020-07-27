package com.example.myapp;

public class Users {
    String userId;
    String username;
    String address;
    boolean isloggedin;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setIsloggedin(boolean isloggedin) {
        this.isloggedin = isloggedin;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public boolean isIsloggedin() {
        return isloggedin;
    }

    public String getUsername() {
        return username;
    }
}
