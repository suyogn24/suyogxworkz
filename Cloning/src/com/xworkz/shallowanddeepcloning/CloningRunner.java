package com.xworkz.shallowanddeepcloning;

public class CloningRunner {

	public static void main(String[] args) throws CloneNotSupportedException{
	
		 Department department = new Department ("343", "B", "WRD Department");	 
	     Employee employee = new Employee (637, "Suyog",department);
	 
		 System.out.println(department);
		 System.out.println(employee);
		 
		 Employee employee2= (Employee)employee.clone();
		
		 employee2.getDept().setEmpId("IncomeTax Department-637");
			
		 System.out.println("Employee details >>>>"+employee);
		 System.out.println("Employee details2 >>>>"+employee2);
			
		 
	}
}