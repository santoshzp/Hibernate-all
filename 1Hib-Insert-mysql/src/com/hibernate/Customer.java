package com.hibernate;

public class Customer {
	private int Id;
	private String Name;
	private String city;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer() {
		super();
	}
	public Customer(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		this.city = city;
	}
	
	

}
