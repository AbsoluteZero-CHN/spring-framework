package com.noload.spring.autowired;


import org.springframework.stereotype.Component;


@Component
public class AutoWiredInject implements IAutowired, LazyTestInterface {

	public AutoWiredInject() {
		System.out.println("com.noload.spring.autowired.AutoWiredInject 被实例化了");
	}
}
