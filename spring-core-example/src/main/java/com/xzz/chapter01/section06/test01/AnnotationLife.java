/**
 * 
 */
package com.xzz.chapter01.section06.test01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Administrator
 *- ע��ʽ�������ڹ���
 */
public class AnnotationLife {

	@PostConstruct
	public void init() {
		System.out.println("=========ע��ʵ����������init============");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("=========ע��ʵ����������destory============");
	}
}
