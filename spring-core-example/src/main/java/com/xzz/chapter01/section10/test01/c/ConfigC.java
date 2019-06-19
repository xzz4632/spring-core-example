package com.xzz.chapter01.section10.test01.c;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Service.class))
//@ComponentScan(excludeFilters = @Filter(type = FilterType.REGEX, pattern = ".*ComponentC2"))
@ComponentScan(includeFilters = @Filter(type = FilterType.ANNOTATION, classes = MyAnnotation.class))
public class ConfigC {

	/**
	 * 当使用includeFilters引入注解类型时, 是在默认的基础上引入额外定义的.
	 */
	
	/**
	 * 当type是FilterType.REGEX时, pattern定义的是目标组件, 注意的是组件要在扫描范围之内
	 */
}
