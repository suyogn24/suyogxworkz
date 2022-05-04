package com.xworkz.collectionsmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
	
		Map<String,String> iplTeamCaptainMap = new HashMap<>();
		iplTeamCaptainMap.put("Mumbai Indians", "Rohit Sharma");
		iplTeamCaptainMap.put("RCB", "Du plessis");
		iplTeamCaptainMap.put("CSK", "Ravindra Jadeja");
		iplTeamCaptainMap.put("KKR", "Shreyas Iyer");
		iplTeamCaptainMap.put("DC", "Rishabh Pant");
		iplTeamCaptainMap.put("Sunrises Hyderabad", "Kame Williamson");
		iplTeamCaptainMap.put("Rajasthan Royals", "Sanju Samson");
		iplTeamCaptainMap.put("Punjab Kings", "Mayank Agarwal");
		iplTeamCaptainMap.put("Lucknow Super Giants", "Kl Rahul");
		iplTeamCaptainMap.put("Gujarat Titans", "Hardik Pandya");
		iplTeamCaptainMap.put("Pune Warriors", "Suyog");
		iplTeamCaptainMap.put("Nashik Giants ", "Rohit");
	    iplTeamCaptainMap.put("Aurangabad Royals", "Prasad");
		iplTeamCaptainMap.put("Royal Kings", "Akshay");
		iplTeamCaptainMap.put("Kerala Indians", "Vaibhav");



        System.out.println(iplTeamCaptainMap.size());
		
		Set<String> keys = iplTeamCaptainMap.keySet();
		keys.forEach(c->System.out.println(c));
		
		Collection<String> values = iplTeamCaptainMap.values();
		values.forEach(e->System.out.println(e));
		
		
		
		System.out.println("=========Entry Set for iplTeamCaptain ============== ");
		
		
       Set<Entry<String,String>> entrySet = iplTeamCaptainMap.entrySet();
		
		for (Entry<String,String> entry : entrySet)  {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : " + key + " " + "Value " + value);
		}
		
		System.out.println("forEach method for iplTeamCaptain ");
		
		
		entrySet.forEach(e ->System.out.println(e.getKey() + " " + e.getValue()));
		iplTeamCaptainMap.forEach((k,v)->System.out.println(k +" "+v));
		
		
		

		

	}

}
