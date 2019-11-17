package com.noload.spring.main;


import com.noload.spring.AppConfig;
import com.noload.spring.cycle.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(IndexService.class).getUserService();
	}
}
