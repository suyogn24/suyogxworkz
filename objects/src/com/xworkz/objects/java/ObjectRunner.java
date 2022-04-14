package com.xworkz.objects.java;

import com.xworkz.java.Bread;

public class ObjectRunner {

	public static void main(String[] args) {
		
       Bread bread new Bread();
       System.out.println(bread);
       
       int name=bread.hashCode();
       System.out.println(name);
       
       String name1=bread.toString();
       System.out.println(name1);
	}

}
