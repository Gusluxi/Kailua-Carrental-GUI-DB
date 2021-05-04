package com.example.kailua.Repository;

import com.example.kailua.Model.Zipcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ZipcodeRepo {

    @Autowired
    JdbcTemplate template;

    public List<Zipcode> fetchAll() {
        String sql = "SELECT * FROM zipcodes";
        RowMapper<Zipcode> rowMapper = new BeanPropertyRowMapper<>(Zipcode.class);
        return template.query(sql, rowMapper);
    }
}
