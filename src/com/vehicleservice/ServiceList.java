package com.vehicleservice;

import java.util.ArrayList;
import java.util.List;

public class ServiceList {
    public  static List<Services> services = new ArrayList<>();

    static {
        services.add(new Services(1,"car", "carwash"));
        services.add(new Services(2,"bike", "bikewash"));
        services.add(new Services(3,"cycle", "puncture"));
    }



}
