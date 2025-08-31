package com.foodorderingapp;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int UserId;
    private String Name;
    private String Email;

    public User(int userId, String name, String email) {
        UserId = userId;
        Name = name;
        Email = email;
    }

    public User() {

    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }


}
