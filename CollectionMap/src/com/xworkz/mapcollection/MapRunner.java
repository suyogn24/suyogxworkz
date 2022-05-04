package com.xworkz.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
	Map<String,Integer> CountryNamePinCodeMap = new HashMap<>();
	CountryNamePinCodeMap.put("India",15216);
	CountryNamePinCodeMap.put("Austria",46375);
	CountryNamePinCodeMap.put("Brazil",224984);
	CountryNamePinCodeMap.put("Canada",765344);
	CountryNamePinCodeMap.put("Germany",16482);
	CountryNamePinCodeMap.put("Indonesia",86554);
	CountryNamePinCodeMap.put("Japan",94378);
	CountryNamePinCodeMap.put("Mexico",75203);
	CountryNamePinCodeMap.put("Poland",21980);
	CountryNamePinCodeMap.put("Spain",56532);
	CountryNamePinCodeMap.put("Switzerland",4614);
	CountryNamePinCodeMap.put("UK",1690561);
	CountryNamePinCodeMap.put("Malaysia",2818);
	CountryNamePinCodeMap.put("Italy",19938);
	CountryNamePinCodeMap.put("France",52727);
		
		System.out.println(CountryNamePinCodeMap.size());
		
		
		Set<String> keys = CountryNamePinCodeMap.keySet();
		keys.forEach(c ->System.out.println(c));
		
		Collection<Integer> values = CountryNamePinCodeMap.values();
		values.forEach(e ->System.out.println(e));

		
		System.out.println("=========Entry Set for CountryNamePinCode======== ");
		
		
		
	    Set<Entry<String,Integer>> entrySet = CountryNamePinCodeMap.entrySet();
		
		for (Entry<String,Integer> entry : entrySet)  {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key : " + key + " " + "Value " + value);
		}
		
		
		System.out.println("forEach method for CountryNamePinCode ");
		
		entrySet.forEach(e ->System.out.println(e.getKey() + " " + e.getValue()));
		CountryNamePinCodeMap.forEach((k,v)->System.out.println(k +" "+v));
		
		
		

	}

}
