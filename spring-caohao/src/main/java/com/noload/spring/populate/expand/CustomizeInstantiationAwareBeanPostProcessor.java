package com.noload.spring.populate.expand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-12 11:17
 */
@Component
public class CustomizeInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return !beanName.equals("dontPopulateBean");
	}
}
