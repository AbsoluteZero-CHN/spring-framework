package com.noload.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class ThirdBeanConfiguration {

	@Bean
	public ThirdBean thirdBean() {
		return new ThirdBean();
	}
}
