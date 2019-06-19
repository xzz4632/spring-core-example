package com.xzz.chapter01.section10.test02;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {

	private String name;

	public ComponentA() {
		super();
		this.name = "componentA";
	}
	
	

	public ComponentA(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComponentA [name=" + name + "]";
	}

}
