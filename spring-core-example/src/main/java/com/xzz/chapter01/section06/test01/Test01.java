package com.xzz.chapter01.section06.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("chapter01/section06/test01/beans.xml");
	
		//ctx.stop();
		
		//ctx.start();
		
		// ¹Ø±ÕÈÝÆ÷
		ctx.registerShutdownHook();
	}
}
