package com.example.springjdbc.dao;

import com.example.springjdbc.dto.SimpleBbsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SimpleBbsDAO implements ISimpleBbsDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<SimpleBbsDTO> getList() {
        String sql = "SELECT * FROM simple_bbs ORDER BY id DESC";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<SimpleBbsDTO>(SimpleBbsDTO.class));
    }

    @Override
    public SimpleBbsDTO view(String id) {
        String sql = "SELECT * FROM simple_bbs WHERE id = '" + id + "'";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<SimpleBbsDTO>(SimpleBbsDTO.class));
    }

    @Override
    public int write(final String writer, final String title, final String content) {
        String sql = "INSERT INTO simple_bbs(id, writer, title, content)" +
                "VALUES(simple_bbs_seq.nextval, ?, ?, ?)";
        return jdbcTemplate.update(sql, writer, title,content);
    }

    @Override
    public int delete(final String id) {
        String sql = "DELETE FROM SIMPLE_BBS WHERE ID = ?";
        return jdbcTemplate.update(sql, id);
    }
}
