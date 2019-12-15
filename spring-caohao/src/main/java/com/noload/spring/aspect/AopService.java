package com.noload.spring.aspect;


import org.springframework.stereotype.Service;

@Service
public class AopService {

	public void execute() {
		System.out.println("强制使用代理!");
	}
}
