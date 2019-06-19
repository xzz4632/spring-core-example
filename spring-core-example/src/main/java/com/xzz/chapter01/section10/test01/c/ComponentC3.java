package com.xzz.chapter01.section10.test01.c;

import java.util.Random;

@MyAnnotation
public class ComponentC3 {

	private String random;

	public ComponentC3() {
		this.random = new Random().nextInt(100000) + "";
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "ComponentC3 [random=" + random + "]";
	}

}
