package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


//exclude to stop generating password in the console
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableWebSecurity
public class SpringCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheExampleApplication.class, args);
	}

}
