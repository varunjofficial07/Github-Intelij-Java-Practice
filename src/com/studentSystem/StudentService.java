package com.studentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public int id;
    public String name;
    public int age;
    public String address;

    boolean found = false;

    Scanner sc = new Scanner(System.in);

    List<Student> students = new ArrayList<>();

    Student std1 = new Student(1,"vijay",18,"chennai");
    Student std2 = new Student(2,"surya",20,"madhurai");
    Student std3 = new Student(3,"simbu",19,"delhi");
    Student std4 = new Student(4,"vishal",17,"mumbai");

    public StudentService(){
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
    }
    //View All Students
    public void viewAllStudent(){
        for (Student student: students){
            System.out.println(student);
        }
    }
    //View Student by Id
    public void viewStudentById(){
        System.out.println("Enter the Student id: ");
        id = sc.nextInt();
        for(Student student: students){
            if(student.getId() == id){
                System.out.println(student);
                found = true;
            }
        }
        if(!found){
            System.out.println("Student doesn't exist");
        }
    }
    public void updateStudentDetails(){
        System.out.println("Enter the Student id to update: ");
        id = sc.nextInt();
        for(Student student: students){
            if(student.getId() == id){
                System.out.println("Enter the name: ");
                name = sc.next();
                System.out.println("Enter the age: ");
                age = sc.nextInt();
                student.setName(name);
                student.setAge(age);
                System.out.println("Student details Updated.");
                System.out.println(student);
            }
        }
        if(!found){
            System.out.println("Student ila. ");
        }
        else {
            System.out.println("Update successfull");
        }
    }
    public void deleteStudent(){
        System.out.println("Enter the Student Id to delete: ");
        id = sc.nextInt();
        for(Student student: students){
            if(student.getId() == id){
                students.remove(student);
            }
        }
        if(!found){
            System.out.println("Student doesn't exist!");

        }
        else {
            System.out.println("Student Deleted sucessfully");
        }
    }
    public void addStudent(){
        System.out.println("Enter the id: ");
        id = sc.nextInt();
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        System.out.println("Enter the address: ");
        address = sc.next();
        Student newStudent = new Student(id,name,age,address);
        students.add(newStudent);
        System.out.println("Details updated successfully.");
    }
}
