package com.springcore2.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("com/springcore2/auto/wire/autoconfig.xml");
		Emp emp=(Emp) ct.getBean("emp");
		System.out.println(emp);
	}

}
