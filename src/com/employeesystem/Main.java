package com.employeesystem;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        menu();
        boolean isActive = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add employee");
                    service.addEmployee();
                    break;
                case 2:
                    System.out.println("2.View employee");
                    service.viewEmployeeById();
                    break;

                case 3:
                    System.out.println("3.Update employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("4.Delete employee");
                    service.deleteEmployee();
                    break;
                case 5:
                    System.out.println("5.View All employee");
                    service.viewEmployee();
                    break;
                case 6:
                    System.out.println("6.exit");
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            };
        }while (isActive);
    }
    public static void menu(){
        System.out.println("******Employeee Management System******");
        System.out.println("1.Add employee");
        System.out.println("2.View employee");
        System.out.println("3.Update employee");
        System.out.println("4.Delete employee");
        System.out.println("5.View All employee");
        System.out.println("6.exit");
    }
}
