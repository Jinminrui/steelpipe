package com.nuist.jmr.steelpipe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nuist.jmr.steelpipe.dao")
public class SteelpipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteelpipeApplication.class, args);
    }

}

