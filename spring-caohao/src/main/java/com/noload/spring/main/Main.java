package com.noload.spring.main;


import com.noload.spring.AppConfig;
import com.noload.spring.aspect.AopService;
import com.noload.spring.aspect.JDKDynamicProxyInterface;
import com.noload.spring.aspect.JDKSecondDynamicProxyInterface;
import com.noload.spring.configuration.OtherComponentTest;
import com.noload.spring.cycle.IndexService;
import com.noload.spring.cycle.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO 此处构造方法会调用父类构造方法, 父类构造方法会实例化一个 DefaultListableBeanFactory
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = ac.getBean(IndexService.class);
		UserService userService = ac.getBean(UserService.class);
		ac.getBean(OtherComponentTest.class);
		userService.getIndexService();
		indexService.getUserService();
		JDKDynamicProxyInterface jdkDynamicProxy = ac.getBean(JDKDynamicProxyInterface.class);
		JDKSecondDynamicProxyInterface jdkSecondDynamicProxyInterface = ac.getBean(JDKSecondDynamicProxyInterface.class);
		jdkDynamicProxy.execute();
		jdkSecondDynamicProxyInterface.execute();
		ac.getBean(AopService.class).execute();
	}
}
