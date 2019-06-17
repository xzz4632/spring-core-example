package com.xzz.chaper01.section03.test03;

public class Person {

	private String name;

	private int age;

	private Address address;
	
	/**
	 * 静态工厂方法
	 * @return
	 */
	public static Person getInstance() {
		return new Person();
	}
	
	/**
	 * 实例化工厂方法
	 * @return
	 */
	public Address getAddr() {
		Address address = new Address();
		address.setAddress("深圳");
		return address;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
