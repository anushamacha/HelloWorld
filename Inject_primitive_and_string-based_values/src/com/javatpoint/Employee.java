package com.javatpoint;

public class Employee {
	private int id;  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void show(){  
	    System.out.println(id+" "+name);  
	} 
}
