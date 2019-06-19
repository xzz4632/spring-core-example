package com.xzz.chapter01.section04.test06;

import java.util.Random;

public class Address {

	private long timestamp;
	
	public Address() {
		this.timestamp = new Random().nextInt(100000);
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Address [timestamp=" + timestamp + "]";
	}

}
