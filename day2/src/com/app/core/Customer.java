package com.app.core;

public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	//parameterized constructor
	public Customer(String name, String email, int age, double creditLimit) {
		super();	
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
//		System.out.println("in parameterized constructor");
	}
	
	//initializing the values and passing to param constructor via constructor chaining method
	public Customer() {
		this("Riya", "riya@gmail.com", 25, 10000);
//		System.out.println("in parameterless constructor");
	}

	//initializing only creditLimt but passing the rest to param constructor via constructor chaining.
	public Customer(String myName, String myEmail, int myAge)
	{
		this(myName, myEmail, myAge, 15000.0);		
//		System.out.println("3 ips from user constructor");
	}
		
	

	/*
	 * Customer(String name, String email, int age){ this(name, email, age, "riya",
	 * "riya@gmail.com", 23); }
	 */

	public String getDetails() {
		return "Customer name: " + name + " Credit details: " + creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public double setCreditLimit() {
		return creditLimit;
	}
}
