package com.xzz.chapter01.section15.test01;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class Config {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
		ms.setBasenames("chapter01/section15/test01/format");
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}
	
	@Bean
	public Example example() {
		return new Example();
	}
}
