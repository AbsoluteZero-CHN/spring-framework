package com.noload.spring.aspect;


import org.springframework.stereotype.Service;

@Service
public class JDKDynamicProxy implements JDKDynamicProxyInterface {

	@Override
	public void execute() {
		System.out.println("com.noload.spring.aspect.JDKDynamicProxy#execute()");
	}
}
