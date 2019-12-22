package com.noload.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author hao.caosh@ttpai.cn
 * @time 2019-11-18 15:48
 */
@Component
public class ComponentService {

	@Autowired
	private PrototypeService prototypeService;
	@Autowired
	private PrototypeService prototypeService2;


	@PostConstruct
	public void postConstruct() {

	}

	public void close() {
		System.out.println("com.noload.spring.component.ComponentService.close 关闭");
	}
}
