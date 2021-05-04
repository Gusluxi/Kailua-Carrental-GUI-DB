package com.example.kailua.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Contract {

    @Id
    private int contractID;
    private LocalDate contractDateStart;
    private LocalDate contractDateEnd;
    private int maxKM;
    private int startOdometer;
    private int customerID;
    private String plateNumber;

    public Contract() {
    }

    public int getContractID() {return contractID;}

    public void setContractID(int contractID) {this.contractID = contractID; }

    public LocalDate getContractDateStart() {return contractDateStart; }

    public void setContractDateStart(LocalDate contractDateStart) {this.contractDateStart = contractDateStart; }

    public LocalDate getContractDateEnd() {
        return contractDateEnd;
    }

    public void setContractDateEnd(LocalDate contractDateEnd) {
        this.contractDateEnd = contractDateEnd;
    }

    public int getMaxKM() {return maxKM; }

    public void setMaxKM(int maxKM) {this.maxKM = maxKM; }

    public int getStartOdometer() {return startOdometer; }

    public void setStartOdometer(int startOdometer) {this.startOdometer = startOdometer; }

    public int getCustomerID() {return customerID; }

    public void setCustomerID(int customerID) {this.customerID = customerID; }

    public String getPlateNumber() {return plateNumber; }

    public void setPlateNumber(String plateNumber) {this.plateNumber = plateNumber; }



}
