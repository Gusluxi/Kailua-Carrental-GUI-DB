package com.example.demo.Repository;

import com.example.demo.model.Contract;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepo {

    @Autowired
    JdbcTemplate template;

    public List<Customer> fetchAll() {
        String sql = "select * from customers, address, zipcodes where address.zipcodeid = zipcodes.zipcodeid and customers.addressid = address.addressid;";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql, rowMapper);
    }

    public Customer addCustomer(Customer customer) {
        String sql = "INSERT INTO customers (name, mobile_phone, email, driver_licence, driver_since_date) VALUES (?, ?, ?, ?)";
        template.update(sql, customer.getCustomerID(), customer.getAddressID());
        return null;
    }
}
