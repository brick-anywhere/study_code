package com.dll.conditional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dll
 * @date 2021-01-20 16:10
 */
@SpringBootApplication(scanBasePackages = "com.dll.*")
@MapperScan(basePackages = "com.dll.conditional.mapper")
public class ConditionalApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConditionalApplication.class, args);
    }
}
