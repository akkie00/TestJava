package com.app.org;

public class Manager extends Employee {

	private double perfBonus;
	
	public Manager(int id, String name, double basicSal, int deptID, double perfBonus) { 
		super(id, name, deptID, basicSal); 
		this.perfBonus= perfBonus;		
	}
	
	@Override
	public String getDetails() {
		
		return "id: "+super.getId()+" name: "+super.getName()+" Basic Salary: "+super.getBasicSal()
		+"DeptID: "+super.getDeptID()+"Performance B: "+perfBonus;
	}
	
	@Override
	public double computeNetSalary() {
		return (getBasicSal()+perfBonus);
//		return ;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}
}
	 
