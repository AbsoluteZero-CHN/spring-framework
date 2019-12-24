package com.noload.spring.configuration;

public class SecondBean {

	private final FirstBean firstBean;

	public SecondBean(FirstBean firstBean) {
		this.firstBean = firstBean;
		System.out.println("SecondBean init...");
	}
}
