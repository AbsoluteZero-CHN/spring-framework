package com.noload.spring.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IndexService indexService;

	public UserService() {
		System.out.println("UserService 实例化完成");
	}
}
