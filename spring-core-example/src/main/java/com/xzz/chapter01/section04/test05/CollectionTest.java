/**
 * 
 */
package com.xzz.chaper01.section04.test05;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class CollectionTest {

	private List<Person> personList;

	private Map<String, Person> personMap;

	public CollectionTest() {
		super();
	}

	public CollectionTest(List<Person> personList, Map<String, Person> personMap) {
		super();
		this.personList = personList;
		this.personMap = personMap;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Map<String, Person> getPersonMap() {
		return personMap;
	}

	public void setPersonMap(Map<String, Person> personMap) {
		this.personMap = personMap;
	}

	@Override
	public String toString() {
		return "CollectionTest [personList=" + personList + ", personMap=" + personMap + "]";
	}

}
