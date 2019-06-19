package com.xzz.chapter01.section03.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xzz.chapter01.section03.test02.Account.Address;

/**
 * 
 * @author Administrator
 *
 */
public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section03/test02/beans.xml");
		// ͨ��������ȡbean
		Account account = (Account) context.getBean("account3");
		
		System.out.println(account.getName()); //xzz
		
		// ��ȡ�ڲ�bean
		Address addr = context.getBean(Account.Address.class);
		System.out.println(addr.getAddress()); // �人
	}
}
