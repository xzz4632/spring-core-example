package com.xzz.chapter01.section10.test01.a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {
	
	/**
	 * -ComponentScan()Ĭ��ɨ�跶Χ
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		ComponentA a = ctx.getBean(ComponentA.class);
		System.out.println(a);
		
	}
	
	
}
