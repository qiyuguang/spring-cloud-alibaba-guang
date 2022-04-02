package com.tulingxueyuan.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("/mapper/**/*")
@SpringBootApplication
public class OrderSeataApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSeataApplication.class,args);
    }
}
