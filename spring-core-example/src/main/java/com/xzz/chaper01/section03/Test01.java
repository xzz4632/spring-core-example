/**
 * 
 */
package com.xzz.chaper01.section03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * 
 */
public class Test01 {
	
	/**
	 * -��û�и�bean����id��name����ʱ, spring��Ϊ������Ψһ��bean����,��������������Ϊ ȫ�޶�����+ #+����.
	 * @param args
	 */

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section03/Test01/beans.xml");
		
		String[] names = context.getBeanNamesForType(TestServiceImpl.class);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
