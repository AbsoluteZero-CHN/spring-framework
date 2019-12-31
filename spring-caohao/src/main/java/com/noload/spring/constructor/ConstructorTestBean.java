package com.noload.spring.constructor;

import com.noload.spring.configuration.FirstBean;
import com.noload.spring.configuration.SecondBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-30 11:53
 */
@Component
public class ConstructorTestBean {

	public ConstructorTestBean() {
		System.out.println("com.noload.spring.constructor.ConstructorTestBean.ConstructorTestBean()");
	}

	public ConstructorTestBean(FirstBean firstBean) {
		System.out.println("com.noload.spring.constructor.ConstructorTestBean.ConstructorTestBean(com.noload.spring.configuration.FirstBean)");
	}

	/*@Autowired(required = false)*/
	public ConstructorTestBean(FirstBean firstBean, SecondBean secondBean, int initIndex) {
		System.out.println("com.noload.spring.constructor.ConstructorTestBean.ConstructorTestBean(com.noload.spring.configuration.FirstBean, com.noload.spring.configuration.SecondBean, int)");
	}
}
