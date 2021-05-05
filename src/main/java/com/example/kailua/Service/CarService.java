package com.example.kailua.Service;

import com.example.kailua.Repository.CarRepo;
import com.example.kailua.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    public List<Car> fetchAll(){
        return carRepo.fetchAll();
    }

    public List<Car> sortCarTier(String carTier) {
        List<Car> allCars = fetchAll();
        List<Car> sortedCars = new ArrayList<>();

        for (Car car : allCars) {
            if (carTier.equals(car.getCartier())) {
                sortedCars.add(car);
            }
        }
        return sortedCars;
    }
}