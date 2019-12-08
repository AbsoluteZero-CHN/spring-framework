package com.noload.spring;


import com.noload.spring.annotation.AutoComponentTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;


@ComponentScan(value = {"com.noload.spring.component", "com.noload"},
		/**
		 * TODO 排除所有被 @AutoComponentTest 标注的类
		 * */
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = AutoComponentTest.class)})
@EnableAspectJAutoProxy(exposeProxy = true)
public class AppConfig {

	public static class Node {

		@Override
		public boolean equals(Object obj) {
			return false;
		}

		@Override
		public int hashCode() {
			return 1;
		}
	}
}
