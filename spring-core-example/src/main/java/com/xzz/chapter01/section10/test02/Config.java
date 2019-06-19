package com.xzz.chapter01.section10.test02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(nameGenerator = MyBeanNameGenerator.class)
public class Config {
	

//	
}
