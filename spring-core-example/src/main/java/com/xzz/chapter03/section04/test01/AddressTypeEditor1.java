package com.xzz.chapter03.section04.test01;

import java.beans.PropertyEditorSupport;

public class AddressTypeEditor1 extends PropertyEditorSupport {

	/**
	 * ͨ���������ַ�����������ֵ, ����ַ�����ʽ����ȷ, �����׳��쳣
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(new Address(text));
	}

	/**
	 * ���û�ı䱻�༭�Ķ���
	 */
	@Override
	public void setValue(Object value) {
		super.setValue(value);
	}

}
