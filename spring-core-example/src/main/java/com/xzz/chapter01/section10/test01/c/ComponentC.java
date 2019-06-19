package com.xzz.chapter01.section10.test01.c;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ComponentC {

	private String random;

	public ComponentC() {
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
		return "ComponentC [random=" + random + "]";
	}

}
