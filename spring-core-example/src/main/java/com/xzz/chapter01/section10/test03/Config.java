package com.xzz.chapter01.section10.test03;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(scopeResolver = MyScope.class)
public class Config {

	@Bean
	@Scope("one")
	public Component component() {
		Component c = new Component();
		c.setRandom(new Random() + "");
		return c;
	}
}
