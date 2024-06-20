package com.springcore2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore2.javaconfig")
public class Javaconfig {
	

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean(name= {"student","temp","con"})
	public Student getStudent() 
	{
		Student stud1=new Student(getSamosa());
		return stud1;
	}
}
