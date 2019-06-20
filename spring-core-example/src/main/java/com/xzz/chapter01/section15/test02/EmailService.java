package com.xzz.chapter01.section15.test02;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
/**
 * 实现ApplicationEventPublisherAware, 获取ApplicationEventPublisher
 * 通过ApplicationEventPublisher对象来发布事件
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
			System.out.println("=============发送消息=============");
			BlackListEvent event = new BlackListEvent(this, address, content);
			publisher.publishEvent(event);
			System.out.println("发布事件:" + event);
			return;
		}
		
		System.out.println("=============发送邮件=============");
	}

}
