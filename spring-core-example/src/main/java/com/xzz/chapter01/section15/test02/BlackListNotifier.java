package com.xzz.chapter01.section15.test02;

import org.springframework.context.ApplicationListener;

/**
 * 实现ApplicationListener
 * 通过其泛型参数定义监听的事件的具体类型
 * 
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

	private String notificationAddress;
	
	// 对接收到的事件进行处理
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		
		System.out.println("=========收到消息=============");

		try {
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(event);
	}
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}
	
	public String getNotificationAddress() {
		return this.notificationAddress;
	}

}
