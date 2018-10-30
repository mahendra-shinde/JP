package com.shaunak;

public class User {

    private String UserName;
    private String PassWord;
    private String Role;
    private Boolean Active;

    public User() {

    }
    public User(String UserName, String PassWord, String Role, Boolean Active) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Role = Role;
        this.Active = Active;
    }

    @Override
    public String toString() {
        return "User{" +
                "User Name='" + UserName + '\'' +
                ", Password=" + PassWord +
                ", Role='" + Role + '\'' +
                ", Active='" + Active + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean active) {
        Active = active;
    }

    public String getUserName() {
        return UserName;
    }
}
