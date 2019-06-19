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
	 * ��ʹ��includeFilters����ע������ʱ, ����Ĭ�ϵĻ�����������ⶨ���.
	 */
	
	/**
	 * ��type��FilterType.REGEXʱ, pattern�������Ŀ�����, ע��������Ҫ��ɨ�跶Χ֮��
	 */
}
