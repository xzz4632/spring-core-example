package com.xzz.chaper01.section04.test05;

public class Person {

	private Address address;

	private Job job;

	public Person() {
	}

	public Person(Address address, Job job) {
		this.address = address;
		this.job = job;
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
		return "Person [address=" + address + ", job=" + job + "]";
	}

}
