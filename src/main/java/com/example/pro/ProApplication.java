package com.example.pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class ProApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProApplication.class, args);
		
	}

}
