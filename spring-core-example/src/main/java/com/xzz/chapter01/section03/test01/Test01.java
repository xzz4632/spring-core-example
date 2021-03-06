package com.xzz.chapter01.section03.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Administrator
 * 
 */
public class Test01 {
	
	/**
	 * -当没有给bean配置id或name属性时, spring会为其生成唯一的bean名称,但是其命名规则为 全限定类名+ #+数字.
	 * -如果此时由文档所说的以小写开头的简单类名获取bean会抛出NoSuchBeanDefinitionException异常
	 * @param args
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("section03/Test01/beans.xml");
		
		String[] names = context.getBeanNamesForType(TestServiceImpl.class);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
