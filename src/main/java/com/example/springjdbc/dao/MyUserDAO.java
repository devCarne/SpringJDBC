package com.example.springjdbc.dao;

import com.example.springjdbc.dto.MyUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyUserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MyUserDTO> getList() {
        String sql = "SELECT * FROM MYUSER";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));
    }
}
