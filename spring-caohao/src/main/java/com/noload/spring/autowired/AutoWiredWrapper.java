package com.noload.spring.autowired;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class AutoWiredWrapper implements IAutowired {
	@Lazy
	// TODO 懒加载的 bean 这里会注入一个代理对象,
	//  但实际上, 如果 @Lazy 注解标注在 filed 上, 这里对应的 bean 依然会被实例化,
	//  同时也完成了生命周期, 只有标注在 class 上才不被实例化, 不使用 @Autowired 注解使用自动装配也无效
	//  可能是 Spring 的一个 BUG
	private LazyTestInterface lazyTestInterface;


	@Lazy
	public void setAutoWiredInject(LazyTestInterface lazyTestInterface) {
		this.lazyTestInterface = lazyTestInterface;
	}
}
