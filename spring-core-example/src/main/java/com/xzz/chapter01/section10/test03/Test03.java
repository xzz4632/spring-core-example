/**
 * -�Զ���������,
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
package com.xzz.chapter01.section10.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 *
 *         -����ʧ�� -����ʧ�� -����ʧ�� -����ʧ�� -����ʧ�� -����ʧ�� -����ʧ��
 */
public class Test03 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Component c = ctx.getBean(Component.class);

		System.out.println(c);

	}
}
