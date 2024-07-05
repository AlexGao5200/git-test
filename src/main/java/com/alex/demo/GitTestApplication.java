package com.alex.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.alex.demo.mapper")
public class GitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

}
