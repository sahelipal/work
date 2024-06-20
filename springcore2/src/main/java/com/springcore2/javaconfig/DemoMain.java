package com.springcore2.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext ct=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student stud=(Student)ct.getBean("student");
		System.out.println(stud);
		stud.study(); 
	}

}
