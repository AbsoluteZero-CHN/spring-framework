package com.noload.spring.constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-30 14:20
 */
@Component
public class SetConstructorTestBeanAutowireModeBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		ScannedGenericBeanDefinition beanDefinition = (ScannedGenericBeanDefinition) beanFactory.getBeanDefinition("constructorTestBean");
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
