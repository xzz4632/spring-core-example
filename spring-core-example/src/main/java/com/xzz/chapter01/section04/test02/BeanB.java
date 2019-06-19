package com.xzz.chaper01.section04.test02;

public class BeanB {

	private BeanA beanA;
	
	public BeanB() {}
	
	public BeanB(BeanA a) {
		this.beanA = a;
	}

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}
	
	
}
