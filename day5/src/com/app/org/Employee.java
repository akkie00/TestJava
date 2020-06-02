package com.app.org;

public class Employee {
	private int id;
	private String name;
	private int deptID;
	private double basicSal;
	
	//parameterized constructor
	public Employee(int id, String name, int deptID, double basicSal) {
	
		this.id = id;
		this.name = name;
		this.deptID = deptID;
		this.basicSal = basicSal;
		
	}
	//explicitly implementing default constructor
	/*
	 * public Employee() {
	 * 
	 * }
	 */
	//getting employee details
	public String getDetails() {
		
		return "id: "+id+"name: "+name+"Dept ID: "+deptID+"basicSal: "+basicSal;
	}
	
	// method for computing net salary
	public double computeNetSalary() {
		return 0;
	}
	
	//getter for ID
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDeptID() {
		return deptID;
	}
	public double getBasicSal() {
		return basicSal;
	}
	
}
