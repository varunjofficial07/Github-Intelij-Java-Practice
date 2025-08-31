package com.studentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Scanner sc = new Scanner(System.in);

        boolean isActive = true;

        do{
            menu();
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1.Add student");
                    studentService.addStudent();
                    break;
                case 2:
                    System.out.println("2.View student");
                    studentService.viewStudentById();
                    break;
                case 3:
                    System.out.println("3.Update student");
                    studentService.updateStudentDetails();
                    break;
                case 4:
                    System.out.println("4.Delete student");
                    studentService.deleteStudent();
                    break;
                case 5:
                    System.out.println("5.View All student");
                    studentService.viewAllStudent();
                    break;
                case 6:
                    System.out.println("6.exit");
                    isActive = false;
                    break;
                default:
                    System.out.println("Enter the valid choice");
                    break;
            }
        }while (isActive);
    }
    public static void menu(){
        System.out.println("******Student Management System******");
        System.out.println("1.Add student");
        System.out.println("2.View student");
        System.out.println("3.Update student");
        System.out.println("4.Delete student");
        System.out.println("5.View All student");
        System.out.println("6.exit");
    }
}
