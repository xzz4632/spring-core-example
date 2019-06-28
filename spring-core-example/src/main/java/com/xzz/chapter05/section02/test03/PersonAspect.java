package com.xzz.chapter05.section02.test03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {

	//@Pointcut("execution(* insert(..))")
	@Pointcut(value = "args(p)", argNames = "p")
	public void getPerson(Person p) {
		
	}
	
	
	@Before("getPerson(p)")
	public void before(Person p) {
		System.out.println(p.getName());
		System.out.println("==========before=========");
	}
}
