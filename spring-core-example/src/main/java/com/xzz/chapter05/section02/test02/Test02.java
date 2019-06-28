package com.xzz.chapter05.section02.test02;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		AccountService service = ctx.getBean(AccountService.class);
		
		service.getAccountName("xzz");
		
	}
}
