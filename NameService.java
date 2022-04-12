package com.xworkz.exceptions;

public class NameService {


	private String[] names=new String[5];
	private int index=0;
	
	public NameService() {
      System.out.println("Invoking default Name service constructor");
	
	}
	
	public boolean add(String name)
	{
		if(name!=null)
		{
			if(!(name.length()>3) && (name.length()>=50) ||  !name.matches ("[A-Z a-z]+"))
			{
				System.out.println("Name is invalid "+name);
				return false;
			}
			
			
			else {
				if(index<names.length)
				{
					this.names[index]=name;
					System.out.println("Name is founded===="+name);
					this.index++;
					return true;
				}
				System.out.println("Name is not founded beacuse index is full  ===="+name);
			}
		}
		return false;
	}
	
}
