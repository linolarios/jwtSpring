package com.jwtsecurity.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.jwtsecurity.demo.model")
public class MainApplicationClass extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}


