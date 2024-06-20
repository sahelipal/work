package com.springcore2.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("com/springcore2/ref/refconfig.xml");
		B b=(B)ct.getBean("bref");
		System.out.println(b);
		A a=(A)ct.getBean("aref");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
	}

}
