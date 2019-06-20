package com.xzz.chapter01.section12.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class Config2 {

	@Bean
	public BeanA beanA() {
		BeanA a = new BeanA();
		a.setBeanB(beanB());
		return a;
	}
	
	@Bean
	public BeanB beanB() {
		return new BeanB();
	}
}
