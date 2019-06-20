package com.xzz.chapter01.section15.test02;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

/**
 * ע�ⶨ���¼�������
 */
public class BlackListNotifier2 {

	private String notificationAddress;
	
	// �Խ��յ����¼����д���
	@EventListener
	@Order(42)
	public void onApplicationEvent(BlackListEvent event) throws InterruptedException {
		
		//Thread.sleep(10000);
		
		System.out.println("=========ע��ʽ�����¼� : �յ���Ϣ=============");

		//System.out.println(event);
	}
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}
	
	public String getNotificationAddress() {
		return this.notificationAddress;
	}

}
