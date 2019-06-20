package com.xzz.chapter01.section15.test03;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Publisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher = applicationEventPublisher;
	}
	
	public void publish() {
		System.out.println("===========开始发布事件===========");
		publisher.publishEvent(new SyncEvent(this, "*EVENT"));
		System.out.println("===========发布事件完成===========");
	}

}
