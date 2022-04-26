package com.xworkz.grocerylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class GroceryListRunner {

	public static void main(String[] args) {

		Collection<String> collection;
		
		List<String> list=new ArrayList<>();
		
		list.add("Milk Packet");
		list.add("Vegetables");
		list.add("Fruits");
		list.add("Oil");
		list.add("Bread");
		list.add("Sugar");
		list.add("Rice");
		list.add("Dal");
		list.add("Biscuit");
		list.add("Soap");
		
		System.out.println("size"+list.size());
		list.add(6,"reads java");
		
		String element=list.get(10);
		System.out.println("element" +element);
		
		int indexOf=list.indexOf("ground");
		System.out.println("indexOf"+indexOf);
		

		int lastIndex=list.lastIndexOf(null);
		System.out.println("lastIndex"+lastIndex);
		
		ListIterator<String> listIterator=list.listIterator(list.size()-1);
		
		while(listIterator.hasPrevious())
		{
			String ele = listIterator.previous();
			System.out.println(ele);
		}
	}

}
