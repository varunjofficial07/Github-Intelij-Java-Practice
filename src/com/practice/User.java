package com.practice;

public class User {
    String username;
    String email;
    int age;
    User(String username, String email){
        this.username = username;
        this.email = email;
    }
    void  showDetails(){
        System.out.println(this.username + "'s Email is " + this.email);
    }
    void role(){
        System.out.println("role is working");
    }

}
