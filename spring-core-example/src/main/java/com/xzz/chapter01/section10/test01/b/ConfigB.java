package com.xzz.chapter01.section10.test01.b;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(useDefaultFilters = false) // 禁用组件扫描(使 @Component, @Service, @Repository, @Controller注解失效)
public class ConfigB {

}
