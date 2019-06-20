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
		System.out.println("===========��ʼ�����¼�===========");
		publisher.publishEvent(new SyncEvent(this, "*EVENT"));
		System.out.println("===========�����¼����===========");
	}

}
