package com.example.kailua.Repository;

import com.example.kailua.Model.Contract;
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
        String sql = "INSERT INTO contracts (contract_date_start, contract_date_end, maxkm, start_odometer, customerid, platenumber) VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, contract.getContractDateStart(), contract.getContractDateEnd(), contract.getMaxKM(), contract.getStartOdometer(), contract.getCustomerID(), contract.getPlateNumber());
        return null;
    }

}
