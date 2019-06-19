package com.xzz.chapter01.section10.test02;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class MyBeanNameGenerator implements BeanNameGenerator {

	
	
	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		String beanName = definition.getBeanClassName();
		System.out.println(beanName);
		return beanName.substring(beanName.lastIndexOf(".") + 1) + "1";
	}

}
