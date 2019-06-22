package com.xzz.chapter03.section04.test01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Person p = ctx.getBean(Person.class);
		
		System.out.println(p.getAddr().getCity());
		
	}
}
