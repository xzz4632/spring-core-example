package com.xzz.chapter01.section10.test01.a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {
	
	/**
	 * -ComponentScan()ƒ¨»œ…®√Ë∑∂Œß
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		ComponentA a = ctx.getBean(ComponentA.class);
		System.out.println(a);
		
	}
	
	
}
