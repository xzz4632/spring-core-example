package com.xzz.chapter01.section04.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("section04/test03/beans.xml", "section04/test03/beans2.xml");
		
		Person p0 = (Person) ctx.getBean("person0");
		System.out.println(p0);
		
		Person p1 = (Person) ctx.getBean("person1");
		System.out.println(p1);
		Person p2 = (Person) ctx.getBean("person2");
		System.out.println(p2);
		
		Person p5 = (Person) ctx.getBean("person5");
		System.out.println(p5);
		
		Person p6 = (Person) ctx.getBean("person6");
		System.out.println(p6);
		
		Person p7 = (Person) ctx.getBean("person7");
		System.out.println(p7);
		
		Person p8 = (Person) ctx.getBean("person8");
		System.out.println(p8);
		
		Person p9 = (Person) ctx.getBean("person9");
		System.out.println(p9);
	}
}
