package com.xzz.chapter01.section05.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	/**
	 * 非单例作用域bean的依赖注入
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section05/test01/beans.xml");
		
		Person p = (Person) ctx.getBean("person");
		
		System.out.println(p.getRadomBean());
		System.out.println(p.getRadomBean());
		System.out.println(p.getRadomBean());
		System.out.println(p.getRadomBean());
	}
}
