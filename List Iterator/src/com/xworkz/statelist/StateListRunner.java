package com.xworkz.statelist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class StateListRunner {

	public static void main(String[] args) {
		
		
	  Collection<String> collection;
		
		List<String> list=new ArrayList<>();
		
		list.add("Maharashtra");
		list.add("Karnataka");
		list.add("Tamil Nadu");
		list.add("Andhra Pradesh");
		list.add("Kerala");
		list.add("Gujarat");
		list.add("Madhya Pradesh");
		list.add("Uttar Pradesh");
		list.add("Punjab");
		list.add("Uttarakhand");
		list.add("West Bengal");
		list.add("Haryana");
		list.add("Arunachal Pradesh");
		list.add("Himachal Pradesh");
		list.add("Bihar");
		
		
		System.out.println("size"+list.size());
		list.add(8,"reads java");
		
		String element=list.get(15);
		System.out.println("element" +element);
		
		int indexOf=list.indexOf("ground");
		System.out.println("indexOf"+indexOf);
		

		int lastIndex=list.lastIndexOf(null);
		System.out.println("lastIndex"+lastIndex);
		
		ListIterator<String> listIterator=list.listIterator();
		
		while(listIterator.hasNext())
		{
			String ele = listIterator.next();
			System.out.println(ele);
		}
	}


}
