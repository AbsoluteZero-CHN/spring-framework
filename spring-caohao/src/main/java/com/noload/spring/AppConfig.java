package com.noload.spring;


import com.noload.spring.annotation.AutoComponentTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(value = "com.noload", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = AutoComponentTest.class)})
@EnableAspectJAutoProxy(exposeProxy = true)
public class AppConfig {
}
