package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct=
		new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Person person=(Person)ct.getBean("person");
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		
		System.out.println("----------------------------");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		
		System.out.println("----------------------------");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
		
	}

}
