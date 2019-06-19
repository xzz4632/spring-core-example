package com.xzz.chapter01.section04.test03;

public class Person {

	private String name;

	private int age;

	private boolean student;

	private Address address;
	
	

	public Person() {
		/*
		 * ²âÊÔ¸´ºÏÊôĞÔÉèÖÃ
		 */
		//this.address = new Address();
	}

	public Person(String name, int age, boolean student, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.student = student;
		this.address = address;
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

	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean student) {
		this.student = student;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", student=" + student + ", address=" + address + "]";
	}

}
