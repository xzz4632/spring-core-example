package com.xzz.chapter01.section15.test02;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * 注解定义事件监听器
 */
public class BlackListNotifier2 {

	private String notificationAddress;
	
	// 对接收到的事件进行处理
	@EventListener
	@Order(42)
	public void onApplicationEvent(BlackListEvent event) throws InterruptedException {
		
		//Thread.sleep(10000);
		
		System.out.println("=========注解式处理事件 : 收到消息=============");

		//System.out.println(event);
	}
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}
	
	public String getNotificationAddress() {
		return this.notificationAddress;
	}

}
