package com.xzz.chapter05.section02.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test03 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
	
		PersonService ps = ctx.getBean(PersonService.class);
		
		Person p = new Person();
		p.setName("zs");
		ps.insert(p);
	}
}
