/**
 * 
 */
package com.xzz.chapter01.section15.test02;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * -spring事件发布
 */
public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
		EmailService es = ctx.getBean(EmailService.class);
		
		es.sendEmail("AAA", "0000000000");
		
	}
}
