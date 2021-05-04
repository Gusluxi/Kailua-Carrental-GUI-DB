package com.example.demo.Repository;

import com.example.demo.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContractRepo {

    @Autowired
    JdbcTemplate template;

    public List<Contract> fetchAll() {
        System.out.println("FetchAll Method starting");
        String sql = "SELECT * FROM contracts";
        RowMapper<Contract> rowMapper = new BeanPropertyRowMapper<>(Contract.class);
        return template.query(sql, rowMapper);
    }

    public Contract addContract(Contract contract){
        String sql = "INSERT INTO kailuacarrental.contracts (contractDateStart, contractDateEnd, maxKM, startOdometer, customerID, plateNumber) VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, contract.getContractDateStart(), contract.getContractDateEnd(), contract.getMaxKM(), contract.getStartOdometer(), contract.getCustomerID(), contract.getPlateNumber());
        return null;
    }

}
