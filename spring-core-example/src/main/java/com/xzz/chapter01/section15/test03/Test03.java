/**
 * 
 */
package com.xzz.chapter01.section15.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 *
 */
public class Test03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
		Publisher p = ctx.getBean(Publisher.class);
		
		p.publish();
	
	}
}
