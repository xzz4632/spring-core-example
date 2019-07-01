package com.xzz.chapter05.section02.test04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
	
	@DeclareParents(value = "com.xzz.chapter05.section02.test04.PersonService", defaultImpl = DefaultPrinter.class)
	public static Printer printer;

	
	@Before("execution(* com.xzz.chapter05.section02.test04.PersonService.*(..))")
	public void before() {
		System.out.println("=========before=========");
	}
	
}
