package com.xzz.chapter01.section10.test01.b;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(useDefaultFilters = false) // �������ɨ��(ʹ @Component, @Service, @Repository, @Controllerע��ʧЧ)
public class ConfigB {

}
