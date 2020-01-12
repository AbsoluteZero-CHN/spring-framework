package com.noload.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoWiredWrapper implements IAutowired {

	@Autowired
	private IAutowired autoWiredInject;
}
