package com.maryanto.dimas.multidatasouce.example.springmultidatasouceexample.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbProfiler {

    @Bean
    public JdbcTemplate jdbcTimbangan(@Qualifier("timbangan") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public JdbcTemplate jdbcAplikasi(@Qualifier("application") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean("timbangan")
    public DataSource databaseTimbangan(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/hr");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

    @Bean("application")
    public DataSource datasouceApplication(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setPassword("admin");
        dataSource.setUsername("postgres");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

}
