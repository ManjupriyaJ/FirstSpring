package com.test.SI;

public class EmployeePrimSI {
	private int id;  
	private String name;
	private String city;
	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void show(){
		System.out.println("ID: "+id+"name: "+name+"City: "+city);
	}
	
}
