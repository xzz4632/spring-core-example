/**
 * 
 */
package com.xzz.chapter01.section10.test01.c;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * 自定义注解
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyAnnotation {

	@AliasFor(annotation = Component.class)
	String value() default "";

}