package com.example.kailua.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zipcode {

    @Id
    private int zipcodeID;
    private int zipcode;
    private String city;

    public Zipcode() {
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

}