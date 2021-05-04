package com.example.demo.Service;

import com.example.demo.Repository.AddressRepo;
import com.example.demo.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public List<Address> fetchAll(){
        return addressRepo.fetchAll();
    }
}
