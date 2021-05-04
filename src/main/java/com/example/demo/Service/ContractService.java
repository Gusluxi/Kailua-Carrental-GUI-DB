package com.example.demo.Service;

import com.example.demo.Repository.ContractRepo;
import com.example.demo.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
