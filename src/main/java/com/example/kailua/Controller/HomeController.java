package com.example.kailua.Controller;

import com.example.kailua.Model.Car;
import com.example.kailua.Model.Contract;
import com.example.kailua.Model.Customer;
import com.example.kailua.Model.SearchC;
import com.example.kailua.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    CarService carService;
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    String globalPlateNumber;

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
        //System.out.println(customerService.getCustomerID());
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
    public String createContract(){
        return "home/createContract";
    }
    @PostMapping("/createContract")
    public String createContract(@ModelAttribute Contract contract){
        contractService.addContract(contract);
        return "redirect:/";
    }

    @PostMapping("/carShow")
    public String showCars(@ModelAttribute SearchC searchC, Model model) {
        model.addAttribute("searchC", searchC);
        List<Car> cars = carService.fetchAll();
        model.addAttribute("cars",cars);

        List<Car> carSearch = carService.sortCarTier(searchC.getCar_tier());
        model.addAttribute("carSearch", carSearch);
        model.addAttribute("carService", carService);

        return "home/selectCarPage";
    }
    /*
    @GetMapping("/createCustomer/{platenumber}")
    public String nogetMedPlateNumber(@PathVariable("platenumber") String platenumber, Model model) {
        model.addAttribute("contract", contractService.findContract(platenumber));
        return "home/createCustomer";
    }
    */
    @GetMapping("/createCustomer/{platenumber}")
    public String createCustomer(@PathVariable("platenumber") String platenumber, Model model){
        globalPlateNumber = platenumber;
        return "home/createCustomer";
    }

    @PostMapping("/createCustomer")
    public String createCustomer(@ModelAttribute Customer customer, Model model){
        System.out.println(globalPlateNumber);
        customerService.addZipcode(customer);
        customerService.addAddress(customer);
        customerService.addCustomer(customer);
        model.addAttribute("customerid",customerService.getCustomerID());
        model.addAttribute("platenumber",globalPlateNumber);
        return "home/createContract";
    }


}
