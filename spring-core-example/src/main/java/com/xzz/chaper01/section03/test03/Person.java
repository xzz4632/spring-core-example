package com.xzz.chaper01.section03.test03;

public class Person {

	private String name;

	private int age;

	private Address address;
	
	/**
	 * ��̬��������
	 * @return
	 */
	public static Person getInstance() {
		return new Person();
	}
	
	/**
	 * ʵ������������
	 * @return
	 */
	public Address getAddr() {
		Address address = new Address();
		address.setAddress("����");
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
