package com.xzz.chapter01.section05.test01;

import java.util.Random;

public class RadomBean {

	private String random;

	public RadomBean() {
		super();
		this.random = new Random().nextInt(1000000) + "";
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "RadomBean [random=" + random + "]";
	}

}
