package com.xworkz.carbrand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRunner {

	
	public static void main(String[] args) {
	
		Collection<String> collection = new  ArrayList<>();
		
		collection.add("Ford");
		collection.add("Toyota");
		collection.add("Honda");
		collection.add("BMW");
		collection.add("Audi");
		collection.add("Jaguar");
		collection.add("Tata");
		collection.add("Tesla");
		collection.add("Bentley");
		collection.add("LandRover");
		
		int totalElements = collection.size();
		
		System.out.println(totalElements);
		
		boolean present = collection.contains("Ford");
		System.out.println(present);
	
		Iterator<String> iterator = collection.iterator();
		
		while(iterator.hasNext())  {
			System.out.println(iterator.next());
		}
	}

}
