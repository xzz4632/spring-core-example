package com.xzz.chapter05.section02.test02;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public String getAccountName(String name) throws IOException {
		System.out.println("=========service:" + name + "=========");
		boolean b = !false;
		if (!b) {
			throw new IOException();
		}
		return name;
	}
}
