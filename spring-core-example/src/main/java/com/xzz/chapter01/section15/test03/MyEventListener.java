package com.xzz.chapter01.section15.test03;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;


public class MyEventListener {

	@EventListener
	@Async
	public void processEvent(SyncEvent event) throws InterruptedException {
		//Thread.sleep(10000);
		System.out.println("+++++++处理事件++++++++");
	}
}
