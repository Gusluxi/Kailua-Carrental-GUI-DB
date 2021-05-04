package com.example.kailua.Service;

import com.example.kailua.Repository.ZipcodeRepo;
import com.example.kailua.Model.Zipcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZipcodeService {
    @Autowired
    ZipcodeRepo zipcodeRepo;

    public List<Zipcode> fetchAll(){
        return zipcodeRepo.fetchAll();
    }
}
