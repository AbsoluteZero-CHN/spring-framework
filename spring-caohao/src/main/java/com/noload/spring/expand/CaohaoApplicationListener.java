package com.noload.spring.expand;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class CaohaoApplicationListener implements ApplicationListener<ApplicationEvent> {


	@Override
	public void onApplicationEvent(org.springframework.context.ApplicationEvent event) {
		System.out.println("Application 事件监听器: " + getClass());
	}
}
