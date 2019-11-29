package com.noload.spring.main;


import com.noload.spring.AppConfig;
import com.noload.spring.aspect.JDKDynamicProxyInterface;
import com.noload.spring.cycle.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = ac.getBean(IndexService.class);
		indexService.getUserService();
		JDKDynamicProxyInterface jdkDynamicProxy = ac.getBean(JDKDynamicProxyInterface.class);
		jdkDynamicProxy.execute();
	}
}
