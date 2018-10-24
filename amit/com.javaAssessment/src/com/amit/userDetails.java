package com.amit;

public class userDetails {

    protected String userId;
    protected String password;

    userDetails(String userId, String password){
        this.userId = userId;
        this.password = password;
    }



    @Override
    public String toString() {
        return "userDetails{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
