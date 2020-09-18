package com.anthony.shatdingspringbootmybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.anthony.shatdingspringbootmybatisgenerator.mapper")
public class ShatdingSpringbootMybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShatdingSpringbootMybatisGeneratorApplication.class, args);
    }

}
