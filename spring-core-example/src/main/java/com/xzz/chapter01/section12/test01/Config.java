package com.xzz.chapter01.section12.test01;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import(Config2.class)
@ImportResource("chapter01/section12/test01/beans.xml")
public class Config {
	
}
