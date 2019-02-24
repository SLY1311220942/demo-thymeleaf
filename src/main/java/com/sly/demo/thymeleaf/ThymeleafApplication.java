package com.sly.demo.thymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.sly.demo.thymeleaf")
@ComponentScan(basePackages = "com.sly.demo.thymeleaf")
public class ThymeleafApplication {

	public static void main(String[] args) {
		int one = 1;
		System.out.println(one);
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}

