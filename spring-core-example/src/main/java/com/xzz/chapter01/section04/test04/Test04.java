package com.xzz.chapter01.section04.test04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

	/**
	 * ¼¯ºÏ×¢Èë
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("section04/test04/beans.xml");
	
		/*
		 * CollectionTest ct = (CollectionTest) ctx.getBean("collectionTest");
		 * System.out.println(ct);
		 */
		
		CollectionTest child = (CollectionTest) ctx.getBean("child");
		System.out.println(child);
	}
}
