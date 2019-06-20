package com.xzz.chapter01.section15.test02;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
/**
 * ʵ��ApplicationEventPublisherAware, ��ȡApplicationEventPublisher
 * ͨ��ApplicationEventPublisher�����������¼�
 */
public class EmailService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	private List<String> blackList;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

		this.publisher = applicationEventPublisher;
	}

	public List<String> getBlackList() {
		return blackList;
	}

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	
	public void sendEmail(String address, String content) {
		if (blackList.contains(address)) {
			System.out.println("=============������Ϣ=============");
			BlackListEvent event = new BlackListEvent(this, address, content);
			publisher.publishEvent(event);
			System.out.println("�����¼�:" + event);
			return;
		}
		
		System.out.println("=============�����ʼ�=============");
	}

}
