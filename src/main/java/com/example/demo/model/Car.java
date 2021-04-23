package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Date;


@Entity
public class Car {

    @Id
    private String platenumber;
    private String cartier;
    private String brandAndModel;
    private String fuelType;
    private LocalDate registrationDate;
    private int odometer;


    public Car() {
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "platenumber='" + platenumber + '\'' +
                ", cartier='" + cartier + '\'' +
                ", brandAndModel='" + brandAndModel + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", date=" + registrationDate +
                ", odometer=" + odometer +
                '}';
    }
}