package com.app.org;

public class Worker extends Employee{
	
	private double hoursWorked, hourlyRate;
	
	public Worker(int id, String name, int deptID, double basicSal) {
		super(id, name, deptID, basicSal);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public String getDetails() {
	 return	"Manger details: "+"id "+super.getId()+"name "+super.getName()+"DeptID "+super.getDeptID()
	 ;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasicSal()+(hourlyRate+hoursWorked);
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	
}
