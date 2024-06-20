package com.springcore2.ci;

public class Addtion {
	private int a;
	private int b;
	
	public Addtion(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("constructor of integer");
	}
	public Addtion(double a,double b) {
		this.a = (int)a;
		this.b =(int) b;
		System.out.println("constructor of double");
	}
	
	public void sum() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("sum is: "+(this.a+this.b));
	}
	
}
