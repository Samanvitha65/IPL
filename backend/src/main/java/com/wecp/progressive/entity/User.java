package com.wecp.progressive.entity;


public class User {
    private int userId;
private String fullName;
private String username;
private String password;
private String email;
private String role;

public User(){

}

public User(int userId, String fullName, String password, String email, String role) {
    this.userId = userId;
    this.fullName = fullName;
    this.password = password;
    this.email = email;
    this.role = role;
}

public int getUserId() {
    return userId;
}

public void setUserId(int userId) {
    this.userId = userId;
}

public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getRole() {
    return role;
}

public void setRole(String role) {
    this.role = role;
}





}