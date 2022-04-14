package com.xworkz.objects.java;

public class Bread {

	public Bread()
	{
		System.out.println("Default Bread Constructor");
	}
	
	@Override
	public int hashCode() {
		System.out.println("Returning int type of Bread hashcode");
		return 45;
	}
	
	@Override
	public String toString() {
		System.out.println("string to string bread");
		return ("Suyog");
	
	}
	
	
}
