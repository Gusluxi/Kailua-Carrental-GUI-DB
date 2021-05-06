package com.example.kailua.Repository;

import com.example.kailua.Model.Customer;
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
        String sql = "select * from customers, address, zipcodes where address.zipcodeida = zipcodes.zipcodeid and customers.addressidc = address.addressid;";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql, rowMapper);
    }

    public Customer addZipcode(Customer customer) {
        String sql = "INSERT INTO zipcodes (zipcode, city) VALUES (?, ?)";
        template.update(sql, customer.getZipcode(), customer.getCity());
        return null;
    }

    public Customer addAddress(Customer customer) {
        String sql = "INSERT INTO address (address, zipcodeida) VALUES (?, (select zipcodeid from zipcodes where zipcodeid = (select max(zipcodeid) from zipcodes)))";
        template.update(sql, customer.getAddress());
        return null;
    }

    public Customer addCustomer(Customer customer) {
        String sql = "INSERT INTO customers (name, mobile_phone, email, driver_licence, driver_since_date, addressidc) VALUES (?, ?, ?, ?, ?, (select addressid from address where addressid = (select max(addressid) from address)))";
        template.update(sql, customer.getName(), customer.getMobilePhone(),customer.getEmail(), customer.getDriverLicence(), customer.getDriverSinceDate());
        return null;
    }

    public int getCustomerID() {
        String sql = "SELECT customerid FROM customers WHERE customerid = (select max(customerid) from customers)";

        int customerID = template.queryForObject(sql, new Object[]{}, Integer.class);

        return customerID;
    }
}
