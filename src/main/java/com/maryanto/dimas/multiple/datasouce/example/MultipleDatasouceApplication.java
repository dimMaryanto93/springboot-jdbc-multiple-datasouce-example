package com.maryanto.dimas.multiple.datasouce.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class MultipleDatasouceApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(MultipleDatasouceApplication.class, args);
    }
}
