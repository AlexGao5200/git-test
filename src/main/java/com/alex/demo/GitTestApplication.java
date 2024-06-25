package com.alex.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alex.demo.mapper")
public class GitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

}
