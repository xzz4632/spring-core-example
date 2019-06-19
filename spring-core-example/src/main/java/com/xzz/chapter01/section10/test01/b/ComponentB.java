package com.xzz.chapter01.section10.test01.b;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ComponentB {

	private String random;

	public ComponentB() {
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
		return "ComponentA [random=" + random + "]";
	}

}
