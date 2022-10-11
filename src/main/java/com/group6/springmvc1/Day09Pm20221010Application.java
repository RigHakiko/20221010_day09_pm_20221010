package com.group6.springmvc1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.group6.springmvc1.mapper")
public class Day09Pm20221010Application {

    public static void main(String[] args) {
        SpringApplication.run(Day09Pm20221010Application.class, args);
    }

}
