package com.noload.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	public FirstBean firstBean() {
		return new FirstBean(secondBean());
	}

	@Bean SecondBean secondBean() {
		return new SecondBean();
	}
}
