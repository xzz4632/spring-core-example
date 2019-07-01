package com.xzz.chapter05.section02.test05;

import org.springframework.stereotype.Service;

@Service
public class Service05 {

	public String selectAccount(String name) {
		System.out.println("=======" + name);
		return name;
	}
}
