package com.xworkz.mapcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<String,String> MobilePersonNameMap = new HashMap<>();
		MobilePersonNameMap.put("Samsung","Suyog");
		MobilePersonNameMap.put("Nokia","Rahul");
		MobilePersonNameMap.put("Oppo","Bharat");
		MobilePersonNameMap.put("MI","Kiran");
		MobilePersonNameMap.put("RealMe","Akash");
		MobilePersonNameMap.put("Apple","Tanmay");
		MobilePersonNameMap.put("Sony","Ajay");
		MobilePersonNameMap.put("Note","Vishal");
		MobilePersonNameMap.put("Iphone","Shubham");
		MobilePersonNameMap.put("Motorolla","Vaibhav");
		MobilePersonNameMap.put("Xiami","Nitesh");
		MobilePersonNameMap.put("Jio","Amol");
		MobilePersonNameMap.put("Vivo","Avinash");
		MobilePersonNameMap.put("Oneplus","Akshay");
		MobilePersonNameMap.put("Reliance","Rohan");
		
		System.out.println(MobilePersonNameMap.size());
		
		
		Set<String> keys = MobilePersonNameMap.keySet();
		keys.forEach(c ->System.out.println(c));
		
		Collection<String> values = MobilePersonNameMap.values();
		values.forEach(e ->System.out.println(e));
		
		
		System.out.println("=========Entry Set for MobilePersonName ============== ");
		

       Set<Entry<String,String>> entrySet = MobilePersonNameMap.entrySet();
		
		for (Entry<String,String> entry : entrySet)  {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : " + key + " " + "Value " + value);
		}
		
		
		
		System.out.println("forEach method for MobilePersonName ");
		
		entrySet.forEach(e ->System.out.println(e.getKey() + " " + e.getValue()));
		MobilePersonNameMap.forEach((k,v)->System.out.println(k +" "+v));
		
		
		
	}

}
