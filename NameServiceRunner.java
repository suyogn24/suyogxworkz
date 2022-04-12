package com.xworkz.exceptions;

public class NameServiceRunner {

	public static void main(String[] args)
	{
		NameService nameService=new NameService();
		nameService.add("XWORKZ");
		try {
			nameService.add("MICROSOFT");
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
		nameService.add("Apple");
		nameService.add("WIPRO");
		nameService.add("TCS@#");
		try {
			nameService.add("TECHMAHINDRA");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
