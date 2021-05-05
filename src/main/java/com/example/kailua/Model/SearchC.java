package com.example.kailua.Model;

public class SearchC {
    private String car_tier;

    public SearchC() {}

    public String getCar_tier() {
        return car_tier;
    }
    public void setCar_tier(String car_tier) {
        this.car_tier = car_tier;
    }

    @Override
    public String toString() {
        return car_tier;
    }
}
