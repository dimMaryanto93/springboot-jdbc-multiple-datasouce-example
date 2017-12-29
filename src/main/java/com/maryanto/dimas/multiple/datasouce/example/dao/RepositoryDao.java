package com.maryanto.dimas.multiple.datasouce.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryDao {

    @Autowired
    @Qualifier("aplikasiJdbcTemplate")
    private JdbcTemplate aplikasiJdbcTemplate;

    @Autowired
    @Qualifier("timbanganJdbcTemplate")
    private JdbcTemplate timbanganJdbcTemplate;

    @Autowired
    @Qualifier("aplicationNamedParameterJdbcTemplate")
    private NamedParameterJdbcTemplate aplikasiNamedParameterJdbcTemplate;

    public void test(){
//        aplikasiJdbcTemplate.execute();
//        timbanganJdbcTemplate.execute();
//        aplikasiNamedParameterJdbcTemplate
    }
}
