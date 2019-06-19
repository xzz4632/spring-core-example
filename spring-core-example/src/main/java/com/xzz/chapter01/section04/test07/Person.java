package com.xzz.chapter01.section04.test07;

import java.util.Random;

public class Person {

	/**
	 * 要被替换的方法
	 * 
	 * @return
	 */
	public String random() {
		return new Random() + "";
	}
	
}
