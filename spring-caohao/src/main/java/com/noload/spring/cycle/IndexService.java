package com.noload.spring.cycle;


import com.noload.spring.component.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private UserService userService;

	private final ComponentService componentService;

	public IndexService(ComponentService componentService) {
		this.componentService = componentService;
		System.out.println("IndexService 实例化完成");
	}

	public UserService getUserService() {
		System.out.println("method getUserService");
		return userService;
	}
}
