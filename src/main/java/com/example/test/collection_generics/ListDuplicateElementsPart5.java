package com.example.test.collection_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDuplicateElementsPart5 {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Naren");
		names.add("Ramesh");
		names.add("Mohan");
		names.add("Narendra");
		
		names.add("Naren");
		names.add("Mohan");
		
//		Printing all names
		System.out.println("Printing all names");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
//		Printing only duplicate names	
		System.out.println("Printing only duplicate names");
		
		Set<String> s = new HashSet<>(); 
		
	
		
		for(String name : names) {
			
			if(s.add(name)==false)
				
			System.out.println(name);
		}
		

	}

}
