package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct=
				new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");

		Student student=(Student)ct.getBean("ob");
		System.out.println(student);
		
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		Student student1=(Student)ct.getBean("ob");
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		
		Teacher t1=(Teacher)ct.getBean("tech");
		Teacher t2=(Teacher)ct.getBean("tech");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
