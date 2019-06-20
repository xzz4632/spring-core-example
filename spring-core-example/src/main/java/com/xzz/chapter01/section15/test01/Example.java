package com.xzz.chapter01.section15.test01;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Example {

	@Autowired
	private MessageSource messageSource;
	
	public void chinaArea() {
		String msg = messageSource.getMessage("area", new Object[] {"ÖÐ¹ú"}, "", Locale.CHINA);
		System.out.println(msg);
	}
	
	public void englishArea() {
		String msg = messageSource.getMessage("area", new Object[] {"ENGLISH"}, "", Locale.ENGLISH);
		System.out.println(msg);
	}
}
