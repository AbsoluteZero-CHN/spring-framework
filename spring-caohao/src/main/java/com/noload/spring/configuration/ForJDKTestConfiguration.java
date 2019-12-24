package com.noload.spring.configuration;

/**
 * TODO 证明在配置类不管是否是接口, 都使用 CGLIB 进行代理
 * */
public interface ForJDKTestConfiguration {

	FirstBean firstBean();
	SecondBean secondBean();
}
