package com.example.demo.Repository;

import com.example.demo.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressRepo {

    @Autowired
    JdbcTemplate template;

    public List<Address> fetchAll() {
        String sql = "SELECT * FROM address";
        RowMapper<Address> rowMapper = new BeanPropertyRowMapper<>(Address.class);
        return template.query(sql, rowMapper);
    }
}