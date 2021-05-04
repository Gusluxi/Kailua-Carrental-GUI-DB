package com.example.kailua.Controller;
import com.example.demo.Service.*;
import com.example.kailua.Model.Car;
import com.example.kailua.Model.Contract;
import com.example.kailua.Model.Customer;
import com.example.kailua.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    @Autowired
    AddressService addressService;
    @Autowired
    ZipcodeService zipcodeService;


    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @GetMapping ("/viewCars")
    public String viewCars(Model model) {
        List<Car> carList = carService.fetchAll();
        model.addAttribute("cars", carList);
        //System.out.println(carService.fetchAll());
        return "home/viewCars";
    }

    @GetMapping ("/viewContracts")
    public String viewContracts(Model model) {
        List<Contract> contractList = contractService.fetchAll();
        model.addAttribute("contracts", contractList);
        //System.out.println(contractService.fetchAll());
        return "home/viewContracts";
    }

    @GetMapping ("/viewCustomers")
    public String viewCustomers(Model model) {
        List<Customer> customerList = customerService.fetchAll();
        model.addAttribute("customers", customerList);

        //System.out.println(customerService.fetchAll());
        return "home/viewCustomers";
    }

    @GetMapping("/createContract")
    public String create() { return "home/createContract"; }
    @PostMapping("/createContract")
    public String create(@ModelAttribute Contract contract){
        contractService.addContract(contract);
        return "redirect:/";
    }
}
