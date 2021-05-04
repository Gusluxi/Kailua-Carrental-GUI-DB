package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int addressID;
    private String address;
    private int zipcodeID;

    public Address() {

    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcodeID() {
        return zipcodeID;
    }

    public void setZipcodeID(int zipcodeID) {
        this.zipcodeID = zipcodeID;
    }
}
