package com.xzz.chapter05.section02.test04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test04 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
	
		PersonService ps = ctx.getBean(PersonService.class);
		
		Printer printer = (Printer) ps;
		Person p = new Person();
		p.setName("ls");
		printer.printName(p);
		
	}
}
