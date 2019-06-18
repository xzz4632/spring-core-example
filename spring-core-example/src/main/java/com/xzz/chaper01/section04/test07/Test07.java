/**
 * 
 */
package com.xzz.chaper01.section04.test07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 * -任意方法替换
 */
public class Test07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section04/test07/beans.xml");
		
		Person p = (Person) ctx.getBean("person");
		
		System.out.println(p.random());
		
		
	}
}
