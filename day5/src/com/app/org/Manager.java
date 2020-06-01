package com.app.org;

public class Manager extends Employee{
	
	private double perfBonus;
	
	public Manager(int id, String name, double basicSal, int deptID, double perfBonus) {
		super(id, name, deptID, basicSal);
		this.perfBonus= perfBonus;
	}
	
}
