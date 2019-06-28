package com.xzz.chapter05.section02.test01.service;

import com.xzz.chapter05.section02.test01.MyParam;
public class OneService implements Service {

	
	public void insert() {
		System.out.println("=========oneService 成功的插入了一条数据=========");
	}
	
	public void update(MyParam pa) throws Exception {
		System.out.println("++++++++++++++oneService UPDATE++++++++++");
	}
}
