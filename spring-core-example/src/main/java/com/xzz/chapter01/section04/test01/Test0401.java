package com.xzz.chapter01.section04.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入  构造函数注入  setter注入
 * @author Administrator
 *
 */
public class Test0401 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("section04/test01/beans.xml");
	
		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
		Person p1 = (Person) ctx.getBean("person1");
		System.out.println(p1);
		
		Person p2 = (Person) ctx.getBean("person2");
		System.out.println(p2);
		
		Person p3 = (Person) ctx.getBean("person3");
		System.out.println(p3);
		
		Person p4 = (Person) ctx.getBean("person4");
		System.out.println(p4);
		
		
		
	}
}
