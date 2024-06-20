package com.springcore2.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ct=new ClassPathXmlApplicationContext("com/springcore2/lifecycle/config.xml");
		Samosa s=(Samosa)ct.getBean("s1");
		System.out.println(s);
		//registering shutdown hook
		ct.registerShutdownHook();
		System.out.println("-----------------------");
		Pepsi p=(Pepsi)ct.getBean("p1");
		System.out.println(p);
	}

}
