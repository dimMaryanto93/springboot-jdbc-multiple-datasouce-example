package com.maryanto.dimas.multidatasouce.example.springmultidatasouceexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryDao {

    @Autowired
    @Qualifier("jdbcAplikasi")
    private JdbcTemplate aplikasiJdbcTemplate;

    @Autowired
    @Qualifier("jdbcTimbangan")
    private JdbcTemplate timbanganJdbcTemplate;

    public void test(){
//        aplikasiJdbcTemplate.execute();
//        timbanganJdbcTemplate.execute();
    }
}
