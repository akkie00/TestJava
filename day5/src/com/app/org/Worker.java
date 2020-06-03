package com.app.org;

public class Worker extends Employee{
	
	private int hoursWorked, hourlyRate;
	
	public Worker(int id, String name, int deptID, double basicSal, int hoursWorked, int hourlyRate) {
		super(id, name, deptID, basicSal);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public String getDetails() {
	 return	"Worker details: "+"id "+super.getId()+"name "+super.getName()+"DeptID "+super.getDeptID()
	 +"Hrs worked: "+hoursWorked+"Hrly Rate: "+hourlyRate;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasicSal()+(hourlyRate+hoursWorked);
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	
}
