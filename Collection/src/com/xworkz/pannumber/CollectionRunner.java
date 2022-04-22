package com.xworkz.pannumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRunner {
	

		public static void main(String[] args) {
		
			Collection<String> collection = new  ArrayList<>();
			

			collection.add("AGHJB1276J");
			collection.add("ABJDK4728Y");
			collection.add("AJFHE7392J");
			collection.add("ANVJH3273N");
			collection.add("AHFJJ1822N");
			collection.add("AVNRJ6828B");
			collection.add("AKURC9273C");
			collection.add("AVJDH8282G");
			collection.add("AMJRC7282D");
			collection.add("ALCJE9282S");
			
			int totalElements = collection.size();
			
			System.out.println(totalElements);
			
			boolean present = collection.contains("AGHJB1276J");
			System.out.println(present);
		
			Iterator<String> iterator = collection.iterator();
			
			while(iterator.hasNext())  {
				System.out.println(iterator.next());
			}
	}

}
