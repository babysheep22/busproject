package com.example.busproject3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Busproject3Application {

	public static void main(String[] args) {
		SpringApplication.run(Busproject3Application.class, args);
	}

}
