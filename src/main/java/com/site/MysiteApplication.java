package com.site;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@MapperScan("com.site.dao")

public class MysiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysiteApplication.class, args);
	}

}
