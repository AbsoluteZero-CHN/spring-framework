package com.noload.spring.aspect;


import org.springframework.stereotype.Component;

@Component
public class JDKSecondDynamicProxy implements JDKSecondDynamicProxyInterface {


	@Override
	public void execute() {
		System.out.println("com.noload.spring.aspect.JDKSecondDynamicProxy.execute()");
	}
}
