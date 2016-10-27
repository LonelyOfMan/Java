package com.mn.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mn.test.person.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Person p = con.getBean("person",Person.class);
		p.info();
	}
}
