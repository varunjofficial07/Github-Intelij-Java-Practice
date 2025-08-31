package com.practice;

public class Student extends  User{

    double gpa;
    Student(String username, String email, double gpa){
        super(username, email);
        this.gpa = gpa;
    }
    void showGpa(){
        System.out.println(this.username+ " 's GPA IS " + this.gpa);
    }

    @Override
    void role(){
        System.out.println("role is studying");
    }

}
