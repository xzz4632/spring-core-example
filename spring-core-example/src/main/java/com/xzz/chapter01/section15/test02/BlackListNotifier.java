package com.xzz.chapter01.section15.test02;

import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;

/**
 * ʵ��ApplicationListener
 * ͨ���䷺�Ͳ�������������¼��ľ�������
 * 
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent>, Ordered {

	private String notificationAddress;
	
	// �Խ��յ����¼����д���
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		
		System.out.println("=========�յ���Ϣ=============");

		/*
		 * try { Thread.sleep(20000L); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println(event);
	}
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}
	
	public String getNotificationAddress() {
		return this.notificationAddress;
	}

	@Override
	public int getOrder() {
		
		return 43;
	}

}
