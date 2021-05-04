package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private int addressID;
    private String address;
    private int zipcodeID;

    public Address() {}

}
