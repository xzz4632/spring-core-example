package com.xzz.chapter01.section10.test01.c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestC {

	/**
	 * - ComponentScan()
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigC.class);

		ComponentC c = ctx.getBean(ComponentC.class);
		System.out.println(c);

		ComponentC2 c2 = ctx.getBean(ComponentC2.class);
		System.out.println(c2);
		
		/**
		 * -自定义注解
		 */
		ComponentC3 c3 = ctx.getBean(ComponentC3.class);
		System.out.println(c3);

	}

}
