package com.employeesystem;

public class Employee {
    private int empId;
    private String empName;
    private int empAge;
    private String empDesignation;
    private int empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Employee(int empId, String empName, int empAge, String empDesignation, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary;
    }
}
