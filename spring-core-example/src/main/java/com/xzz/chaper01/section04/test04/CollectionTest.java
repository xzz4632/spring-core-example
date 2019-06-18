package com.xzz.chaper01.section04.test04;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionTest {

	private List<String> list;

	private List<Integer> intList;

	private Set<String> set;

	private Map<String, Object> map;

	private Properties properties;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Integer> getIntList() {
		return intList;
	}

	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}

	@Override
	public String toString() {
		return "CollectionTest [list=" + list + ", intList=" + intList + ", set=" + set + ", map=" + map
				+ ", properties=" + properties + "]";
	}

}
