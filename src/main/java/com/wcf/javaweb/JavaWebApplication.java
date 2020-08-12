package com.wcf.javaweb;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.wcf.javaweb.pojo")
@EnableJpaRepositories("com.wcf.javaweb.dao")
public class JavaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebApplication.class, args);
    }

}
