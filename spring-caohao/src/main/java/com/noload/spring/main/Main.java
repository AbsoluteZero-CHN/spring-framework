package com.noload.spring.main;


import com.noload.spring.AppConfig;
import com.noload.spring.aspect.AopService;
import com.noload.spring.aspect.JDKDynamicProxyInterface;
import com.noload.spring.aspect.JDKSecondDynamicProxyInterface;
import com.noload.spring.configuration.OtherComponentTest;
import com.noload.spring.cycle.IndexService;
import com.noload.spring.cycle.UserService;
import com.noload.spring.expand.ManualAddBeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\class");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// TODO 此处构造方法会调用父类构造方法, 父类构造方法会实例化一个 DefaultListableBeanFactory
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.addBeanFactoryPostProcessor(new ManualAddBeanDefinitionRegistryPostProcessor());
		ac.register(AppConfig.class);
		ac.refresh();
		IndexService indexService = ac.getBean(IndexService.class);
		UserService userService = ac.getBean(UserService.class);
		ac.getBean(OtherComponentTest.class);
		// TODO 这里由于创建 ThirdBean 的 bean 是一个 @Bean 注解标注的工厂方法, 因此这里返回的 BeanDefinition 对象是
		//  class org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader$ConfigurationClassBeanDefinition
		//  另外这个 BeanDefinition 是不会存储 beanClass 的, 因为 @Bean 注解方法可以返回一个接口
		BeanDefinition firstBeanDefinition = ac.getBeanDefinition("thirdBean");
		System.out.println(firstBeanDefinition.getClass());
		userService.getIndexService();
		indexService.getUserService();
		JDKDynamicProxyInterface jdkDynamicProxy = ac.getBean(JDKDynamicProxyInterface.class);
		JDKSecondDynamicProxyInterface jdkSecondDynamicProxyInterface = ac.getBean(JDKSecondDynamicProxyInterface.class);
		jdkDynamicProxy.execute();
		jdkSecondDynamicProxyInterface.execute();
		ac.getBean(AopService.class).execute();
		ac.close();
	}
}
