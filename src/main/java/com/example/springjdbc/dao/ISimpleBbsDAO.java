package com.example.springjdbc.dao;

import com.example.springjdbc.dto.SimpleBbsDTO;

import java.util.List;

public interface ISimpleBbsDAO {

    public List<SimpleBbsDTO> getList();

    public SimpleBbsDTO view(String id);

    public int write(String writer, String title, String content);

    public int delete(String id);

}
