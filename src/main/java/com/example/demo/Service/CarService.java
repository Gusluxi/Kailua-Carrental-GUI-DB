package com.example.demo.Service;

import com.example.demo.Repository.CarRepo;
import com.example.demo.model.Car;
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