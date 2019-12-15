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
	public void pointCut() {}

	@Pointcut("execution(* com.noload.spring.aspect.JDKDynamicProxy.execute(..))")
	public void pointCutJDK(){}

	@Pointcut("execution(* com.noload.spring.aspect.JDKSecondDynamicProxy.execute(..))")
	public void pointCutSecondJDK(){}
	@Pointcut("execution(* com.noload.spring.aspect.AopService.*(..))")
	public void pointCutAopService(){}

	@Before("pointCut()")
	public void before() {
		System.out.println("--------------- IndexService before ---------------");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("--------------- IndexService after ---------------");
	}

	@Before("pointCutJDK()")
	public void beforeJDK(){
		System.out.println("--------------- JDKDynamicProxy after ---------------");
	}

	@After("pointCutJDK()")
	public void afterJDK() {
		System.out.println("--------------- JDKDynamicProxy after ---------------");
	}

	@Before("pointCutSecondJDK()")
	public void beforeSecondJDK() {
		System.out.println("--------------- JDKSecondDynamicProxy before ---------------");
	}

	@Before("pointCutAopService()")
	public void beforeAop() {
		System.out.println("--------------- AopService before ---------------");
	}
}
