package com.xzz.chapter01.section15.test02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public EmailService emailService() {
		EmailService es = new EmailService();
		List<String> ls = new ArrayList<>();
		ls.add("AAA");
		ls.add("BBB");
		es.setBlackList(ls);
		return es;
	}
	
	@Bean
	public BlackListNotifier blackListNotifier() {
		return new BlackListNotifier();
	}
}
