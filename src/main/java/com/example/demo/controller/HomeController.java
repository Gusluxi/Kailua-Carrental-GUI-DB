package com.example.demo.controller;
import com.example.demo.Repository.CarRepo;
import com.example.demo.Repository.ContractRepo;
import com.example.demo.model.Car;
import com.example.demo.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarRepo carRepo;
    ContractRepo contractRepo;


    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @GetMapping ("/viewCars")
    public String viewCars(Model model) {
        List<Car> carList = carRepo.fetchAll();
        model.addAttribute("cars", carList);
        System.out.println(carRepo.fetchAll());
        return "home/viewCars";
    }

    @GetMapping ("/viewContracts")
    public String viewContracts(Model model) {
        List<Contract> contractList = ContractRepo.fetchAll();
        model.addAttribute("contracts", contractList);
        System.out.println(contractRepo.fetchAll());
        return "home/viewContracts";
    }

}
