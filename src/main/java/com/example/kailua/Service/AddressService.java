package com.example.kailua.Service;

import com.example.kailua.Repository.AddressRepo;
import com.example.kailua.Model.Address;
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
