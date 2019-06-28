package com.xzz.chapter05.section02.test01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OneAspect {

	//@Pointcut("execution(* com.xzz.chapter05.section02.test01..*.*(com.xzz.chapter05.section02.test01.MyParam) throws java.lang.Exception)")
	//@Pointcut("within(com.xzz.chapter05.section02.test01.service..One*)")
	//@Pointcut("this(com.xzz.chapter05.section02.test01.service.Service)")
	//@Pointcut("target(com.xzz.chapter05.section02.test01.service.Service)")
	@Pointcut("args(java.io.Serializable)")
	//@Pointcut("@target(com.xzz.chapter05.section02.test01.MyAnnotation)")
	//@Pointcut("@within(com.xzz.chapter05.section02.test01.MyAnnotation)")
	//@Pointcut("@args(com.xzz.chapter05.section02.test01.MyAnnotation)")
	//@Pointcut("@annotation(com.xzz.chapter05.section02.test01.MyAnnotation)")
	//@Pointcut("bean(*Service)")
	public void onePointCut() {
		System.out.println("========执行切入点方法===========");
	}
	
	@Before("onePointCut()")
	public void before() {
		System.out.println("========before===========");
	}
	
}
