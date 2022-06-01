package com.xworkz.mavenjdbc;

public class Salary {
	
 
	private Double netSalary;
	private Double grossSalary;
	private Double existingLoanAmount;
   
	
    
	public Salary(Double netSalary, Double grossSalary) {
		super();
		this.netSalary = netSalary;
		this.grossSalary = grossSalary;
	}
	
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getExistingLoanAmount() {
		return existingLoanAmount;
	}
	public void setExistingLoanAmount(Double existingLoanAmount) {
		this.existingLoanAmount = existingLoanAmount;
	}

    
    
    
	
}

