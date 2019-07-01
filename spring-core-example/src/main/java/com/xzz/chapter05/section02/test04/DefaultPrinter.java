package com.xzz.chapter05.section02.test04;

public class DefaultPrinter implements Printer {

	@Override
	public void printName(Person p) {
		System.out.println(p.getName());
	}

}
