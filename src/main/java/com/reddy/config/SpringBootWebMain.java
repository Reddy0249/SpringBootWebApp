package com.reddy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.reddy")
public class SpringBootWebMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMain.class, args);
	}

}
