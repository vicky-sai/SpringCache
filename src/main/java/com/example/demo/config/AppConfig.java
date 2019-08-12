package com.example.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.example.demo.model.Payment;

@Configuration
@EnableCaching
@EnableWebSecurity
public class AppConfig {

	@Bean
	public Payment ram() {
		return new Payment(202,"Ram",1000);
	}
	
	@Bean
	public Payment shyam() {
		return new Payment(203,"Shyam",2000);
	}
	
	@Bean
	public Payment mahesh() {
		return new Payment(204,"Mahesh",3000);
	}
}
