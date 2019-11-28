package com.noload.spring.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {


	@Pointcut("execution(* com.noload.spring.cycle.IndexService.getUserService (..))")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		System.out.println("--------------- before ---------------");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("--------------- after ---------------");
	}
}
