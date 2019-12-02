package com.noload.spring.main;


import com.noload.spring.AppConfig;
import com.noload.spring.aspect.JDKDynamicProxyInterface;
import com.noload.spring.aspect.JDKSecondDynamicProxyInterface;
import com.noload.spring.cycle.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO 此处构造方法会调用父类构造方法, 父类构造方法会实例化一个 DefaultListableBeanFactory
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = ac.getBean(IndexService.class);
		indexService.getUserService();
		JDKDynamicProxyInterface jdkDynamicProxy = ac.getBean(JDKDynamicProxyInterface.class);
		JDKSecondDynamicProxyInterface jdkSecondDynamicProxyInterface = ac.getBean(JDKSecondDynamicProxyInterface.class);
		jdkDynamicProxy.execute();
		jdkSecondDynamicProxyInterface.execute();
	}
}
