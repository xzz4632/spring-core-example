package com.xzz.chapter01.section12.test01;

public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	@Override
	public String toString() {
		return "BeanA [beanB=" + beanB + "]";
	}

}
