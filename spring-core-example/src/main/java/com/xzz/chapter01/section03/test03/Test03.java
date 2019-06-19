package com.xzz.chapter01.section03.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section03/test03/beans.xml");

		Person p = (Person) context.getBean("person1");
		System.out.println(p.getName()); 
		
		// 实例化工厂方法实例化bean
		Address address = (Address) context.getBean("address");
		System.out.println(address.getAddress()); //深圳

	}
}
