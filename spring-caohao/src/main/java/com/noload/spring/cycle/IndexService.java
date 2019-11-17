package com.noload.spring.cycle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private UserService userService;

	public IndexService() {
		System.out.println("IndexService 实例化完成");
	}

	public UserService getUserService() {
		System.out.println("method getUserService");
		return userService;
	}
}
