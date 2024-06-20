package com.springcore2.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	
	public Person(String name, int id,Certi certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return  this.name+":"+this.id+"{"+this.certi+"}";
	}
	
	
}
