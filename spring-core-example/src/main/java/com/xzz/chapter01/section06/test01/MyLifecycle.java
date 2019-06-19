/**
 * 
 */
package com.xzz.chapter01.section06.test01;

import org.springframework.context.SmartLifecycle;

/**
 * ʵ��Lifecycle�ӿ�
 * 
 * @author Administrator
 *
 */
public class MyLifecycle implements SmartLifecycle {

	@Override
	public void start() {
		System.out.println("===========start==========");
		
	}

	@Override
	public void stop() {
		System.out.println("============stop===========");
		
	}

	@Override
	public boolean isRunning() {
		System.out.println("==========isRunning=========");
		return false;
	}

}
