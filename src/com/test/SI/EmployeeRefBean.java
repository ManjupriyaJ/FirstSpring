package com.test.SI;

public class EmployeeRefBean {
	private int id;  
	private String name;
	private AddressRefBean address;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressRefBean getAddress() {
		return address;
	}

	public void setAddress(AddressRefBean address) {
		this.address = address;
	}

	public void show(){
		System.out.println("ID: "+id+"name: "+name+"Address: "+address.toString());
	}
	
}
