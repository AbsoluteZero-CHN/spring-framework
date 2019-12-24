package com.noload.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("customBeanName")
public class TestConfiguration implements ForJDKTestConfiguration {

	@Bean
	@Override
	public FirstBean firstBean() {
		return new FirstBean();
	}

	@Bean
	@Override
	public SecondBean secondBean() {
		return new SecondBean(firstBean());
	}
}
