package com.xzz.chapter01.section08.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section08/test02/beans.xml");

		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
		Person p1 = (Person) ctx.getBean("person1");
		System.out.println(p1);
	}
}
