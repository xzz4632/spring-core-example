package com.xzz.chapter01.section06.test01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplementsInterfaceLife implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===========接口实现 init=================");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("============接口实现 destroy=============");
		
	}

}
