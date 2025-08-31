package com.vehicleservice;

public class ServiceProviders {
    private int provider_id;
    private String provider_name;
    private String provider_email;
    private String provider_company;

    public ServiceProviders(int provider_id, String provider_name, String provider_email, String provider_company) {
        this.provider_id = provider_id;
        this.provider_name = provider_name;
        this.provider_email = provider_email;
        this.provider_company = provider_company;
    }

    public ServiceProviders(int provider_id) {
        this.provider_id = provider_id;
    }

    public ServiceProviders() {
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getProvider_email() {
        return provider_email;
    }

    public void setProvider_email(String provider_email) {
        this.provider_email = provider_email;
    }

    public String getProvider_company() {
        return provider_company;
    }

    public void setProvider_company(String provider_company) {
        this.provider_company = provider_company;
    }
}
