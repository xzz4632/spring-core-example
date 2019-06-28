package com.xzz.chapter05.section02.test03;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	
	public void getPerson(List<String> p) {
		System.out.println("get" + p);
	}
	
	public void insert(Person p) {
		System.out.println("insert" + p);
	}
	
}
