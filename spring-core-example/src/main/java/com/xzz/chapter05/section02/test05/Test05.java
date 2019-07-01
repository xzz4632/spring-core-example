package com.xzz.chapter05.section02.test05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Service05 s = ctx.getBean(Service05.class);
		
		s.selectAccount("ls");
	}
}
