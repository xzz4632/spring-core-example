package com.xzz.chapter01.section13.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@ImportResource("chapter01/section13/test01/beans.xml")
public class Config {

	@Profile("dev")
	@Bean("beanB")
	public BeanB beanBDev() {
		BeanB b = new BeanB();
		b.setRandom(100000);
		return b;
	}

	@Profile("pro")
	@Bean("beanB")
	public BeanB beanBProd() {
		BeanB b = new BeanB();
		b.setRandom(-100000);
		return b;
	}

	@Profile("default")
	@Bean("beanB")
	public BeanB beanBDefault() {
		BeanB b = new BeanB();
		b.setRandom(0);
		return b;
	}
}
