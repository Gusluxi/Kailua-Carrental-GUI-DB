package com.example.kailua.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int addressID;
    private String address;
    private int zipcodeIDa;

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

    public int getZipcodeIDa() {
        return zipcodeIDa;
    }

    public void setZipcodeIDa(int zipcodeID) {
        this.zipcodeIDa = zipcodeID;
    }
}
