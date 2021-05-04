package com.example.demo.Service;

import com.example.demo.Repository.ZipcodeRepo;
import com.example.demo.model.Zipcode;
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
