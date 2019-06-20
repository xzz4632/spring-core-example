package com.xzz.chapter01.section10.test03;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class MyScope implements ScopeMetadataResolver {

	@Override
	public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
		
		ScopeMetadata sm = new ScopeMetadata();
		sm.setScopeName("one");
		return sm;
	}

}
