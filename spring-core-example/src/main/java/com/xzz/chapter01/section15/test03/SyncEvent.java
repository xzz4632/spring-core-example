package com.xzz.chapter01.section15.test03;

import org.springframework.context.ApplicationEvent;

public class SyncEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public SyncEvent(Object source, String name) {
		super(source);
		this.name = name;
	}

	private final String name;

	public String getName() {
		return name;
	}

}
