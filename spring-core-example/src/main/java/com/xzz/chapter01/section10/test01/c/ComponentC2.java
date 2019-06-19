package com.xzz.chapter01.section10.test01.c;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ComponentC2 {

	private String random;

	public ComponentC2() {
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
		return "ComponentC2 [random=" + random + "]";
	}

}
