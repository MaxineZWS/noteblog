package com.zwsblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zwsblog.user.mapper")
@SpringBootApplication
public class ZwsblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZwsblogApplication.class, args);
    }

}
