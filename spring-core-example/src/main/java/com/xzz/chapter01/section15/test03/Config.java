package com.xzz.chapter01.section15.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@EnableAsync
@ImportResource(locations = "chapter01/section15/test03/beans.xml")
public class Config {

	@Bean
	public Publisher publisher() {
		return new Publisher();
	}
	
	@Bean
	public MyEventListener myEventListener() {
		return new MyEventListener();
	}
	
}
