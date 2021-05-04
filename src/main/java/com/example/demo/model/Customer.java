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
    private String driverLicence;
    private LocalDate driverSinceDate;
    private int addressIDc;
    private int addressID;
    private String address;
    private int zipcodeIDa;
    private int zipcodeID;
    private int zipcode;
    private String city;

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicense) {
        this.driverLicence = driverLicense;
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

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getAddressIDc() {
        return addressIDc;
    }

    public void setAddressIDc(int addressIDc) {
        this.addressIDc = addressIDc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcodeIDa() {
        return zipcodeIDa;
    }

    public void setZipcodeIDa(int zipcodeIDa) {
        this.zipcodeIDa = zipcodeIDa;
    }

    public int getZipcodeID() {
        return zipcodeID;
    }

    public void setZipcodeID(int zipcodeID) {
        this.zipcodeID = zipcodeID;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", email='" + email + '\'' +
                ", driverLicence='" + driverLicence + '\'' +
                ", driverSinceDate=" + driverSinceDate +
                ", addressIDc=" + addressIDc +
                ", addressID=" + addressID +
                ", address='" + address + '\'' +
                ", zipcodeIDa=" + zipcodeIDa +
                ", zipcodeID=" + zipcodeID +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                '}';
    }
}
