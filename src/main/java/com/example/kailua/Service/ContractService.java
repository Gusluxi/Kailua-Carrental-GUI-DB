package com.example.kailua.Service;

import com.example.kailua.Repository.ContractRepo;
import com.example.kailua.Model.Contract;
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

    public Contract findContract(String platenumber) { return contractRepo.findContract(platenumber); }

    public Boolean deleteContract(int contractID) { return contractRepo.deleteContract(contractID); }
}
