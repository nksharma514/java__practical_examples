package com.example.test.collection_generics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;






public class CollectionMapPart4 {

	public static void main(String[] args) {
		
		
//		Map<String, String> map = new Hashtable<>();		// it is Synchronized, Thread safe, slow, no null allows
		Map<String, String> map = new HashMap<>();			// it is Not Synchronized, not Thread safe, Fast, one null allow
		
		
		map.put("Name", "Narendra");
		map.put("District", "South West");
		map.put("State", "New Delhi");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + " - " +map.get(key));
		}
		
		

	}

}
