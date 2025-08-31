package com.vehicleservice;

public class Services {
    private int service_id;
    private String vehicle_type;
    private String service_name;


    public Services(int service_id, String vehicle_type, String service_name) {
        this.service_id = service_id;
        this.vehicle_type = vehicle_type;
        this.service_name = service_name;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
