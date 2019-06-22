package com.xzz.chapter03.section04.test01;

public class Address {

	private String address1;

	private String city;

	public Address() {
		super();
	}

	public Address(String city) {
		super();
		this.city = city;
	}
	
	public Address(String address1, String city) {
		super();
		this.address1 = address1;
		this.city = city;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address) {
		this.address1 = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
