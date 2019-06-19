package com.xzz.chapter01.section04.test07;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MyMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName());
		return 25 + "";
	}

}
