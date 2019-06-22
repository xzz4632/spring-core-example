package com.xzz.chapter03.section04.test01;

import java.beans.PropertyEditorSupport;

public class AddressTypeEditor1 extends PropertyEditorSupport {

	/**
	 * 通过给定的字符串设置属性值, 如果字符串格式不正确, 可以抛出异常
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new Address(text));
	}

	/**
	 * 设置或改变被编辑的对象
	 */
	@Override
	public void setValue(Object value) {
		super.setValue(value);
	}

}
