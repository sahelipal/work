package com.springcore2.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("com/springcore2/ci/ciconfig.xml");
		Person p=(Person) ct.getBean("person");
		System.out.println(p);
		Addtion add=(Addtion) ct.getBean("add");
		add.sum();
	}

}
