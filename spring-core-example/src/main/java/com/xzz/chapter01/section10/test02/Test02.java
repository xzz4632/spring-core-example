package com.xzz.chapter01.section10.test02;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {
	
	/**
	 * -自定义bean的名称
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
		System.out.println(ctx.getBean(ComponentA.class));
		
		System.out.println(Arrays.toString(ctx.getBeanNamesForType(ComponentA.class)));
		
	}
}
