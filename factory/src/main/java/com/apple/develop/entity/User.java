package com.apple.develop.entity;

import lombok.Data;

@Data
public class User {
    private String no;
    private String userName;
    private String password;
    private String email;
    private String address;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
