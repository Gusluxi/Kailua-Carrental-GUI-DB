package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private String platenumber;
    private String cartier;
    private String brandAndModel;
    private String fuelType;
    private int date;
    private int odometer;


    public Car() {
    }

    public Car(String platenumber, String cartier, String brandAndModel, String fuelType, int date, int odometer) {
        this.platenumber = platenumber;
        this.cartier = cartier;
        this.brandAndModel = brandAndModel;
        this.fuelType = fuelType;
        this.date = date;
        this.odometer = odometer;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getCartier() {
        return cartier;
    }

    public void setCartier(String cartier) {
        this.cartier = cartier;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}