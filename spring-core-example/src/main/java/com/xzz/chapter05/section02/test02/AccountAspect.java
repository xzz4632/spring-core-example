package com.xzz.chapter05.section02.test02;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountAspect {

	@Pointcut("execution( * com.xzz.chapter05.section02.test02.AccountService.*(..) throws java.io.IOException)")
	public void getPointcut() {
		
	}
	
	@Before("getPointcut()")
	public void before(JoinPoint jp) {
		System.out.println("========before=========");
	}
	
	@After("getPointcut()")
	public void after(JoinPoint jp) {
		System.out.println("========after===========");
	}
	
	@AfterReturning(pointcut = "getPointcut()", returning = "name")
	public void afterReturning(String name) {
		
		System.out.println("========afterReturning========");
		System.out.println("return = " + name);
	}
	
	@AfterThrowing(pointcut = "getPointcut()", throwing = "ex")
	public void afterThrowing(Exception ex) {
		System.out.println("=========afterThrowing=========");
	}
	
	//@Around("getPointcut()")
	public void arount(ProceedingJoinPoint pj) {
		System.out.println("==========around========");
	}
}
