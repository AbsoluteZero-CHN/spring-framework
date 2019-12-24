package com.noload.spring.expand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;



public class ManualAddBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("com.noload.spring.expand.ManualAddBeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry 被调用了");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("com.noload.spring.expand.ManualAddBeanDefinitionRegistryPostProcessor#postProcessBeanFactory 被调用了");
	}
}
