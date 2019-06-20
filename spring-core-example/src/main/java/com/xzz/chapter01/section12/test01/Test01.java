/**
 * 
 */
package com.xzz.chapter01.section12.test01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 *
 * -@Bean注解的使用示例
 */
public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	
		BeanA a = ctx.getBean(BeanA.class);
		System.out.println(a);
	}
}
