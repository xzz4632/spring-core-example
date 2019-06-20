/**
 * 
 */
package com.xzz.chapter01.section13.test01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * Environment
 */
public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.register(Config.class);
		ctx.refresh();
		BeanA a = ctx.getBean(BeanA.class);
		System.out.println(a);
		
		BeanB b = (BeanB) ctx.getBean("beanB");
		System.out.println(b);
		
	}
}
