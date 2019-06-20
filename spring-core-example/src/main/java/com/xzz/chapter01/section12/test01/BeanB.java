package com.xzz.chapter01.section12.test01;

import java.util.Random;

public class BeanB {

	private String name;
	
	public BeanB() {
		this.name = new Random().nextInt(1000000) + "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}

}
