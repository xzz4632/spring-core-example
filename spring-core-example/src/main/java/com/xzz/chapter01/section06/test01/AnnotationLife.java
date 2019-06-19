/**
 * 
 */
package com.xzz.chapter01.section06.test01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Administrator
 *- 注解式生命周期管理
 */
public class AnnotationLife {

	@PostConstruct
	public void init() {
		System.out.println("=========注解实现生命周期init============");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("=========注解实现生命周期destory============");
	}
}
