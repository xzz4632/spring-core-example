package com.xzz.chapter05.section02.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.xzz.chapter05.section02.test01.service.OneService;
import com.xzz.chapter05.section02.test01.service.TwoService;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public OneService oneService() {
		return new OneService();
	}
	
	@Bean
	public OneService oneService1() {
		return new OneService();
	}
	
	@Bean
	public TwoService twoService() {
		return new TwoService();
	}
}
