package com.xzz.chapter01.section10.test01.a;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan() // 默认扫描其所在类所在的包及其子包
public class Config {

}
