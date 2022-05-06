package com.xworkz.mapmethods;

import java.util.HashMap;
import java.util.Map;

public class MapMethodRunner {

	public static void main(String[] args) {
		
		
		Map<String,String> stateCapitalMap = new HashMap<>();
		stateCapitalMap.put("Maharashtra","Mumbai");
		stateCapitalMap.put("Karnataka","Bangalore");
		stateCapitalMap.put("Madhya Pradesh","Bhopal");
		stateCapitalMap.put("Uttar Pradesh","Lucknow");
		stateCapitalMap.put("Uttarakhand","Dehradun");
		stateCapitalMap.put("Bihar","Patna");
		stateCapitalMap.put("West Bengal","Kolkata");
		stateCapitalMap.put("Tamil Nadu","Chennai");
		stateCapitalMap.put("Goa","Panaji");
		stateCapitalMap.put("Rajasthan","Jaipur");

		
		
		System.out.println("Size method======================");
		
		System.out.println(stateCapitalMap.size());
		
		
		
		System.out.println("Values method======================");
		
		System.out.println(stateCapitalMap.values());
		
		
		
		System.out.println("Clear method======================");
		
		stateCapitalMap.clear();
		
		stateCapitalMap.forEach((e,s) -> System.out.println(e + " " + s));
		
		
		System.out.println("Compute method======================");
		
	//	stateCapitalMap.compute("Bihar",(key,value) -> value.concat("Modified"));

		
		System.out.println("Values method======================");
		
		stateCapitalMap.values().stream().forEach(val -> System.out.println(val));
		
		
		System.out.println("ComputeifAbsent method======================");
		
		stateCapitalMap.computeIfAbsent("Gujarat", val -> "Gandhinagar");
		
		
		System.out.println("ComputeifPresent method======================");
		
		stateCapitalMap.computeIfPresent("Gujarat",(key, val)-> val.concat("new"));
		
		
		System.out.println("ContainsKey method======================");
		
		stateCapitalMap.containsKey("Maharashtra");
		
		
        System.out.println("ContainsValue method======================");
		
		stateCapitalMap.containsValue("Mumbai");
		
		
        System.out.println("entry set method======================");
		
		//Set<Entry<String,String>> entries = stateCapitalMap.entrySet();
		
        
        System.out.println("Get method======================");
        
        stateCapitalMap.get("Maharashtra");

        
        
        System.out.println("GetOrDefault method======================");
        
        stateCapitalMap.getOrDefault("Tamil Nadu", null);
        
        
        System.out.println("isEmpty method======================");
		
		stateCapitalMap.isEmpty();
		
		
        System.out.println("hashcode method======================");
		stateCapitalMap.hashCode();
		
        
        System.out.println("Put method======================");
		
		String Value = stateCapitalMap.put("Goa", "Panaji");
		
	    System.out.println(Value);

	
			
        System.out.println("PutifPresent method======================");
		
		String previousVal = stateCapitalMap.putIfAbsent("Goa", "Panaji");
		
	    System.out.println(previousVal);
	
	    
	    System.out.println("Remove method======================");
	    
	    
	    stateCapitalMap.remove("Goa");
	    
	    stateCapitalMap.keySet().stream().forEach(key -> System.out.print(key));
	    
	    
	    System.out.println("Remove param method======================");
	    
	    stateCapitalMap.remove("Madhya Pradesh", "Panaji");
	    
	    stateCapitalMap.keySet().stream().forEach(key -> System.out.print(key));
	    
	    
	    System.out.println("Replace method======================");
	    
	    String oldval = stateCapitalMap.replace("Gujarat", "Gandhinagar");
	    
	    System.out.println(oldval);
	    
	    
	    System.out.println("Replace All method======================");
	    
	    stateCapitalMap.replaceAll((key,value) -> value.toUpperCase());
	    
	    
	    
	    
	    
	    
	    
	}

}
