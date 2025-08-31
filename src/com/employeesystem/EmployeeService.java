package com.employeesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    boolean found = false;
    Scanner sc = new Scanner(System.in);

    List<Employee> employees = new ArrayList<>();
    Employee emp1 = new Employee(1,"varun",21, "SDE",12000);
    Employee emp2 = new Employee(2,"kumar",21, "SDE",15000);
    Employee emp3 = new Employee(3,"ishu",21, "SDE",18000);
    //Constructor
    public EmployeeService(){
        {
            employees.add(emp1);
            employees.add(emp2);
            employees.add(emp3);
        }
    }
    //addEmployees
    public void viewEmployee(){
        for(Employee e : employees){
            System.out.println(e);
        }
    }
    //View by EmpID
    public void viewEmployeeById(){
        System.out.println("Enter the Employee Id: ");
        int id = sc.nextInt();
        for (Employee employee : employees){
            if(employee.getEmpId() == id){
                System.out.println(employee);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee doesnot exist.");
        }
    }
    //Update Employee
    public void updateEmployee(){
        System.out.println("Enter the Employee id: ");
        int id = sc.nextInt();
        for(Employee e: employees){
            if(e.getEmpId() == id){
                System.out.println("Enter the name: ");
                String name = sc.next();
                System.out.println("Enter the Salary: ");
                int salary = sc.nextInt();
                e.setEmpName(name);
                e.setEmpSalary(salary);
                System.out.println("Updated details: ");
                System.out.println(e);
            }
        }
        if(!found){
            System.out.println("NOt found.");
        }
        else {
            System.out.println("Updated successfully!");
        }
    }
    public void deleteEmployee(){
        System.out.println("Enter the employeeId to delete: ");
        int id = sc.nextInt();
        for(Employee e: employees){
            if(e.getEmpId() == id){
                employees.remove(e);
            }
        }
        if(!found){
            System.out.println("Employee doesn't exist");
        }
        else {
            System.out.println("Deletion success");
        }
    }

    public void addEmployee(){
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter Designation: ");
        String Designation = sc.next();
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();

        Employee emp = new Employee(id,name,age,Designation,salary);
        employees.add(emp);
        System.out.println("Employee added successfully");


    }
}
