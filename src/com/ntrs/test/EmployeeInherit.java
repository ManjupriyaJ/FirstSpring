package com.ntrs.test;

public class EmployeeInherit {
	private int id;
	private String name;
	private Address address;

	public EmployeeInherit() {
	}

	public EmployeeInherit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmployeeInherit(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address);
	}

	
}
