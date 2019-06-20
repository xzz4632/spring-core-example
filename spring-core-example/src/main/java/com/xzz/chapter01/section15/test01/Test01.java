package com.xzz.chapter01.section15.test01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Example eg = (Example) ctx.getBean("example");
		
		eg.chinaArea();
		eg.englishArea();
		
		
	}
}
