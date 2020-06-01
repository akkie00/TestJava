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
	public Employee() {
		
	}
	
	//getting employee details
	public void getEmpDetails() {
		System.out.println("id: "+id+"name: "+name+"Dept ID: "+deptID+"basicSal: "+basicSal);
	}
	
	public double computeNetSalary() {
		return 0;
	}
}
