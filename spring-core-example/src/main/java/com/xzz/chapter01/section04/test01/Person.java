package com.xzz.chapter01.section04.test01;

public class Person {

	private String name;

	private int age;

	private Address address;

	private Job job;

	public Person() {
	}

	public Person(Address address, Job job) {
		super();
		this.address = address;
		this.job = job;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Address address, Job job) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.job = job;
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", job=" + job + "]";
	}

}
