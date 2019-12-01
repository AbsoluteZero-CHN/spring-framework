package com.noload.spring.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecondAspect {

	@Pointcut("execution(* com.noload.spring.cycle.IndexService.getUserService (..))")
	public void pointCut() {}


	@Before("pointCut()")
	public void before() {
		System.out.println("--------------- IndexService before 2 ---------------");
	}
}
