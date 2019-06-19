package com.xzz.chapter01.section10.test01.b;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestB {

	/**
	 * - ComponentScan() Ω˚”√…®√Ë
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
	
		ComponentB b = ctx.getBean(ComponentB.class);
		System.out.println(b);
	}
	
	
}
