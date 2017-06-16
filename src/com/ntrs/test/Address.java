package com.ntrs.test;

public class Address {
	String city;
	String state;
	String country;
	public Address(){
		System.out.println("Address Default Constructor");
	}
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString(){
		return (city+state+country);
		
	}
	

}
