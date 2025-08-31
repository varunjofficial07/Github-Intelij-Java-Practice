package com.practice;

public class Employee  extends  User{
    int salary;

    Employee (String username, String email, int salary){
        super(username, email);
        this.salary = salary;
    }
    void showSalary(){
        System.out.println(this.username + "'s Salary is "+ this.salary);
    }

    @Override
    void role() {
        System.out.println("Role is to work in Office");
    }
}
