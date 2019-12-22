package com.noload.spring.component.expand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;


@Component
public class ComponentServiceDestroyMethodBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO 当销毁方法方法名为 close 或 shutdown 时, 容器 close 会直接调用. 没啥卵用
		beanFactory.getBeanDefinition("componentService").setDestroyMethodName(AbstractBeanDefinition.INFER_METHOD);
	}
}
