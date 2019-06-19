/**
 * 
 */
package com.xzz.chaper01.section04.test06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 * -查找方法注入
 */
public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section04/test06/beans.xml");
		
		System.out.println("===========编程式===============");
		PersonAware paw = (PersonAware) ctx.getBean("personAware");
		System.out.println(paw.createAddress());
		System.out.println(paw.createAddress());
		System.out.println(paw.createAddress());
		
		
		System.out.println("===========查找方法注入===============");
		Person p = (Person) ctx.getBean("person");
		System.out.println(p.createAddress());
		System.out.println(p.createAddress());
		System.out.println(p.createAddress());
		System.out.println(p.createAddress());
		
		
	}
}
