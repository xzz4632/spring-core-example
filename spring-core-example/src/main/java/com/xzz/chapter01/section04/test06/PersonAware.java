package com.xzz.chaper01.section04.test06;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonAware implements ApplicationContextAware {

	private ApplicationContext ctx;

	private Address address;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.ctx = applicationContext;
	}

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address createAddress() {
		return (Address) ctx.getBean("address");
	}

}
