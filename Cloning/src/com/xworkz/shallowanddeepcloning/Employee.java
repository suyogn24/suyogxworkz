package com.xworkz.shallowanddeepcloning;

public class Employee  implements Cloneable {
  
	private  int id;
	private  String name;
	private  Department dept;
	
	
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	@Override
	public String toString() {
		return super.toString();
	}




	public Employee(int id, String name, Department dept) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	 }
	 
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDept() {
		return dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
