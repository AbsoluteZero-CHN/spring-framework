package com.noload.spring.configuration;

public class FirstBean {

	private final SecondBean secondBean;

	public FirstBean(SecondBean secondBean) {
		this.secondBean = secondBean;
		System.out.println("FirstBean init...");
	}
}
