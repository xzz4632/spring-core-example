package com.xzz.chapter01.section04.test06;

public class Person {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
	
	public Address createAddress() {
		return null;
	}
	
}
