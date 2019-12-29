package com.noload.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("customBeanName")
public class TestConfiguration implements ForJDKTestConfiguration {


	@Bean
	@Override
	public SecondBean secondBean() {
		return new SecondBean(firstBean());
	}

	@Bean
	@Override
	public FirstBean firstBean() {
		// TODO 当这个方法是从 secondBean() 中调用的时候,
		//  断点显示 this 是已经被 GLIB 代理的对象
		return new FirstBean();
	}
}
