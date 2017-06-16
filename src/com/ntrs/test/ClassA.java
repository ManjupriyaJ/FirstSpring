package com.ntrs.test;

public class ClassA {
	ClassB b;
	
	ClassA(){System.out.println("a is created");} 
	
	public ClassA(ClassB b) {
		super();
		System.out.println("a 1-arg is created");
		this.b = b;
	}

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}
	void print(){System.out.println("hello a");} 
	
	void display(){  
		print();  
		b.print(); 
	}

	

}
