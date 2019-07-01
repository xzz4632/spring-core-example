package com.xzz.chapter05.section02.test05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@Configuration
@ImportResource("chapter05/section02/test05/beans.xml")
public class Config {

}
