package com.example.demo.Service;

import com.example.demo.Repository.ContractRepo;
import com.example.demo.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractService {
    @Autowired
    ContractRepo contractRepo;


    public List<Contract> fetchAll(){
        return contractRepo.fetchAll();
    }

    public Contract addContract(Contract contract){
        return contractRepo.addContract(contract);
    }
}
