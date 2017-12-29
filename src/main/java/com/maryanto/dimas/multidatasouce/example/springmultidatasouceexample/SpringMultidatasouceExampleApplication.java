package com.maryanto.dimas.multidatasouce.example.springmultidatasouceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class SpringMultidatasouceExampleApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(SpringMultidatasouceExampleApplication.class, args);


    }
}
