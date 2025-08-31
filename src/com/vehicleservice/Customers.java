package com.vehicleservice;

public class Customers {
    private int customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_password;

    public Customers(int customer_id, String customer_name, String customer_email, String customer_password) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_password = customer_password;
    }

    public Customers() {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_password() {
        return customer_password;
    }

    public void setCustomer_password(String customer_password) {
        this.customer_password = customer_password;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_email='" + customer_email + '\'' +
                ", customer_password='" + customer_password + '\'' +
                '}';
    }

    public static void displayUser(){
        for(Customers c : CustomerList.customers){
            System.out.println(c);
        }
    }

    public void addUser(int id, String name, String email, String passwrod){
        CustomerList.customers.add(new Customers(id,name,email,passwrod));
        System.out.println("User added Successfully");

    }
    public void displayUserbyId(int customer_id){
        boolean found = false;
        for(Customers u : CustomerList.customers){
            if(u.getCustomer_id() == customer_id){
                System.out.println(u);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("User not found");
        }
    }
  
}
