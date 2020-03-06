package com.team.house.housebackapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.house.housebackapp.mapper")
public class HousebackappApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousebackappApplication.class, args);
    }

}
