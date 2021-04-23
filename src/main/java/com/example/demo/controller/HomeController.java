package com.example.demo.controller;
import com.example.demo.repository.CarRepo;
import com.example.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarRepo carRepo;


    @GetMapping("/")
    public String index(Model model){
        List<Car> carList = carRepo.fetchAll();
        model.addAttribute("cars", carList);
        return "home/index";
    }

    @GetMapping ("/viewCars")
    public String viewCars(Model model) {
        List<Car> carList = carRepo.fetchAll();
        model.addAttribute("cars", carList);
        return "home/viewCars";
    }

}
