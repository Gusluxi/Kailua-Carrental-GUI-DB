package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;

public class Contract {

    private int contractID;
    private LocalDate contractDateStart;
    private int maxKM;
    private int startOdometer;
    private int customerIDContract;
    private String plateNumberContract;

    public Contract() {
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public LocalDate getContractDateStart() {
        return contractDateStart;
    }

    public void setContractDateStart(LocalDate contractDateStart) {
        this.contractDateStart = contractDateStart;
    }

    public int getMaxKM() {
        return maxKM;
    }

    public void setMaxKM(int maxKM) {
        this.maxKM = maxKM;
    }

    public int getStartOdometer() {
        return startOdometer;
    }

    public void setStartOdometer(int startOdometer) {
        this.startOdometer = startOdometer;
    }

    public int getCustomerIDContract() {
        return customerIDContract;
    }

    public void setCustomerIDContract(int customerIDContract) {
        this.customerIDContract = customerIDContract;
    }

    public String getPlateNumberContract() { return plateNumberContract; }

    public void setPlateNumberContract(String plateNumberContract) {
        this.plateNumberContract = plateNumberContract;
    }

}
