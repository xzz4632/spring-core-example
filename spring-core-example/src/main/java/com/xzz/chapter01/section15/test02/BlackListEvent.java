package com.xzz.chapter01.section15.test02;

import org.springframework.context.ApplicationEvent;

/**
 * ¼Ì³ÐApplicationEvent½Ó¿Ú
 */
public class BlackListEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1089664438671641456L;

	private final String address;

	private final String content;

	public BlackListEvent(Object source, String address, String content) {
		super(source);
		this.address = address;

		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "BlackListEvent [address=" + address + ", content=" + content + "]";
	}

}
