package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {

    @Id
    private int customerID;
    private String name;
    private int mobilePhone;
    private String email;
    private String driverLicense;
    private LocalDate driverSinceDate;
    private int addressID;

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerid) {
        this.customerID = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public LocalDate getDriverSinceDate() {
        return driverSinceDate;
    }

    public void setDriverSinceDate(LocalDate driverSinceDate) {
        this.driverSinceDate = driverSinceDate;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressid) {
        this.addressID = addressid;
    }

}
