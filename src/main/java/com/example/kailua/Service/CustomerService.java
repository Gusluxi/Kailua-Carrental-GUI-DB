package com.example.kailua.Service;

import com.example.kailua.Model.Contract;
import com.example.kailua.Repository.CustomerRepo;
import com.example.kailua.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> fetchAll(){
        return customerRepo.fetchAll();
    }

    public Customer addZipcode(Customer customer){
        return customerRepo.addCustomer(customer);
    }

    public Customer addAddress(Customer customer){
        return customerRepo.addCustomer(customer);
    }

    public Customer addCustomer(Customer customer){
        return customerRepo.addCustomer(customer);
    }
}
