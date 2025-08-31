package com.vehicleservice;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static List<Customers> customers = new ArrayList<>();
    static{
        customers.add(new Customers(1, "Harish", "harish@email.com", "harish@321"));
        customers.add(new Customers(2, "Suresh", "suresh@email.com", "suresh@321"));
        customers.add(new Customers(3, "Vijay", "vijay@email.com", "vijay@321"));
    }

}
