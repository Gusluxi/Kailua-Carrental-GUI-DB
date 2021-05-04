package com.example.kailua.Service;

import com.example.kailua.Repository.CarRepo;
import com.example.kailua.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

    public List<Car> fetchAll(){
        return carRepo.fetchAll();
    }
}