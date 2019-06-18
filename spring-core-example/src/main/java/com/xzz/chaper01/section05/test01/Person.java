package com.xzz.chaper01.section05.test01;

public class Person {

	private RadomBean radomBean;

	public RadomBean getRadomBean() {
		return radomBean;
	}

	public void setRadomBean(RadomBean radomBean) {
		this.radomBean = radomBean;
	}

	@Override
	public String toString() {
		return "Person [radomBean=" + radomBean + "]";
	}

}
