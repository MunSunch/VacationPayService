package com.munsun.vacation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class VacationPayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(VacationPayServiceApplication.class, args);
    }
}