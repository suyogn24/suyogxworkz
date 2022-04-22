package com.xworkz.aadharcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRunner {

	public static void main(String[] args) {

	Collection<Integer> collection = new  ArrayList<>();
		
	    collection.add(262836272);
		collection.add(738259160);
		collection.add(981364930);
		collection.add(837353729);
		collection.add(729582732);
		collection.add(846536274);
		collection.add(937266738);
		collection.add(947174527);
		collection.add(761934647);
		collection.add(707570472);
		
		int totalElements = collection.size();
		
		System.out.println(totalElements);
		
		boolean present = collection.contains(262836272);
		System.out.println(present);
	
		Iterator<Integer> iterator = collection.iterator();
		
		while(iterator.hasNext())  {
			System.out.println(iterator.next());
		}
	}
		
}
