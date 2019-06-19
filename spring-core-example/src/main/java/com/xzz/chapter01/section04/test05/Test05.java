/**
 * 
 */
package com.xzz.chaper01.section04.test05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator 自动装配
 */
public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section04/test05/beans.xml",
				"chapter01/section04/test05/beans2.xml");

		System.out.println("============no==========");
		Person p0 = (Person) ctx.getBean("person0");
		System.out.println(p0);

		System.out.println("============byName==========");
		Person p1 = (Person) ctx.getBean("person1");
		System.out.println(p1);

		System.out.println("============byType==========");
		Person p2 = (Person) ctx.getBean("person2");
		System.out.println(p2);

		System.out.println("============constructor==========");
		Person p3 = (Person) ctx.getBean("person3");
		System.out.println(p3);

		System.out.println("============集合byType==========");
		CollectionTest collection1 = (CollectionTest) ctx.getBean("collection1");
		System.out.println(collection1);

		System.out.println("============集合constructor==========");
		CollectionTest collection2 = (CollectionTest) ctx.getBean("collection2");
		System.out.println(collection2);
		
		System.out.println("============排除自动装配==========");
		Candidate candidate0 = (Candidate) ctx.getBean("candidate0");
		System.out.println(candidate0);
		
		
	}
}
