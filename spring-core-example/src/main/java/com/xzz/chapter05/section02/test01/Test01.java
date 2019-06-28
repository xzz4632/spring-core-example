package com.xzz.chapter05.section02.test01;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xzz.chapter05.section02.test01.service.OneService;
import com.xzz.chapter05.section02.test01.service.TwoService;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		OneService service = (OneService) ctx.getBean("oneService");
		
		service.insert();
		
		service.update(new MyParam());
		
		/*
		 * OneService service1 = (OneService) ctx.getBean("oneService1");
		 * 
		 * service1.insert();
		 * 
		 * service1.update(new MyParam());
		 */
		
		TwoService service2 = ctx.getBean(TwoService.class);
		
		service2.insert();
	}
}
